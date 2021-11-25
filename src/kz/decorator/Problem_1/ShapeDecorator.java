package kz.decorator.Problem_1;

public abstract class ShapeDecorator implements Shape {
    public Shape shape;
    public ShapeDecorator() {}
    public abstract void draw();
}