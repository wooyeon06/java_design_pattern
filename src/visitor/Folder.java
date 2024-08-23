package visitor;

import java.util.ArrayList;
import java.util.List;

class Folder implements Element {
    private String name;
    private List<Element> elements = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
