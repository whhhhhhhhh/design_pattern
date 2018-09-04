package edu.hebut.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator decorator = new RedShapeDecorator(circle);
        decorator.draw();
    }
}
