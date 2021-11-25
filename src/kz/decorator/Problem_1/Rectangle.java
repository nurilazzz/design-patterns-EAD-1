package kz.decorator.Problem_1;

public class Rectangle implements  Shape {
    @Override
    public void draw() {
        System.out.print("---> This is a Rectangle");
    }
}