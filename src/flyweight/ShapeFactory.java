package flyweight;

import java.util.HashMap;
import java.util.Map;

// 플라이웨이트 팩토리 클래스
class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getCircle() {
        Shape shape = shapes.get("Circle");
        if (shape == null) {
            shape = new Circle();
            shapes.put("Circle", shape);
            System.out.println("Creating a new Circle object");
        } else {
            System.out.println("Reusing existing Circle object");
        }
        return shape;
    }
}
