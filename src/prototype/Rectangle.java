package prototype;

// 구체적인 프로토타입: 사각형 (Rectangle)
public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width " + width + " and height " + height);
    }
}
