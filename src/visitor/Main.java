package visitor;


/**
 *
 Visitor 패턴은 객체 구조를 이루는 요소들에 새로운 기능을 추가하려고 할 때 사용하는 디자인 패턴입니다.
 이 패턴은 각 요소에 대한 처리 로직을 별도의 객체로 분리하여,
 새로운 기능이 추가되더라도 기존 객체 구조를 변경하지 않고도 기능을 확장할 수 있도록 도와줍니다.

 Visitor 패턴은 객체 구조와 그 위에서 수행되는 연산을 분리하여, 기능 확장을 용이하게 하는 강력한 디자인 패턴입니다.
 특히, 다양한 연산을 동일한 객체 구조에 적용해야 할 때 매우 유용합니다.
 하지만 구조가 자주 변경되는 경우에는 유지보수의 어려움이 따를 수 있으므로, 상황에 맞게 패턴을 적용하는 것이 중요합니다.

 */
public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        Folder subFolder = new Folder("subFolder");

        root.addElement(file1);
        root.addElement(file2);
        root.addElement(subFolder);
        subFolder.addElement(new File("file3.txt", 300));

        // 파일 시스템의 전체 크기를 계산하는 Visitor
        SizeVisitor sizeVisitor = new SizeVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total Size: " + sizeVisitor.getTotalSize() + " bytes");

        // 파일과 폴더 이름을 출력하는 Visitor
        NameVisitor nameVisitor = new NameVisitor();
        root.accept(nameVisitor);
    }
}
