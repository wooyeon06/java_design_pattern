package visitor;

class SizeVisitor implements Visitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Folder folder) {
        // 폴더 자체의 크기는 무시하거나 따로 처리할 수 있음
    }

    public int getTotalSize() {
        return totalSize;
    }
}
