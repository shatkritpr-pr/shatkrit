package Week11workshop;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 3);
        shapes[1] = new Circle(4);
        shapes[0] = new Rectangle(10, 9);
        shapes[1] = new Circle(10);

        for (Shape shape : shapes) {
            shape.displayShapeInfo();

            if (shape instanceof Drawable) {
            {
                ((Drawable) shape).draw();
            }
        }
    }
}
}
