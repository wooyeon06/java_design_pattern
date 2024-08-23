package visitor;

interface Visitor {
    void visit(File file);

    void visit(Folder folder);
}
