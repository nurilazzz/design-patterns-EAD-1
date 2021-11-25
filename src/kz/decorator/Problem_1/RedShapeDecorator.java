package kz.decorator.Problem_1;

public class RedShapeDecorator extends ShapeDecorator {
    public Shape shape;

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println(" with Red border\n");
    }
}