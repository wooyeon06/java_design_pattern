package flyweight;

// 플라이웨이트 구현 클래스 (내부 상태: 모양, 외부 상태: 색상)
class Circle implements Shape {
    private final String shapeType = "Circle";  // 내부 상태

    @Override
    public void draw(String color) {
        System.out.println("Drawing a " + shapeType + " with color " + color);
    }
}
