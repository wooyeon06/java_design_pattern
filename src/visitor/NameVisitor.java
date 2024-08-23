package visitor;

class NameVisitor implements Visitor {
    @Override
    public void visit(File file) {
        System.out.println("File: " + file.getName());
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Folder: " + folder.getName());
    }
}
