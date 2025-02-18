package package2;

public class ShapeMain {
    public static void main(String[] args){
        Shape circle = new Circle();
        circle.draw();
        circle.printDetails();

        System.out.println();
        Shape Square = new Square();
        Square.draw();
        Square.printDetails();
    }
}
