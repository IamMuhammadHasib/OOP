public class Main{
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Square();

        shapes.area();
        circle.area();
        triangle.area();
        square.area();
    }
}