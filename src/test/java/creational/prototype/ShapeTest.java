package creational.prototype;

import creational.propotype.Circle;
import creational.propotype.Rectangle;
import creational.propotype.Shape;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ShapeTest {

    @Test
    public void should_create_prototypes() {
        //given
        ArrayList<Shape> shapes = new ArrayList<>();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(1);
        rectangle.setWidth(1);
        rectangle.setX(2);
        rectangle.setY(3);
        rectangle.setColor("Red");

        Circle circle = new Circle();
        circle.setRadius(3);
        circle.setColor("Blue");
        circle.setX(2);
        circle.setY(2);

        shapes.add(rectangle);
        shapes.add(circle);

        ArrayList<Shape> clonedShapes = new ArrayList<>();

        //when
        shapes.forEach(shape -> clonedShapes.add(shape.cloneShape()));

        //then
        assertThat(clonedShapes.size()).isEqualTo(2);
        assertThat(shapes.get(0)).isEqualTo(clonedShapes.get(0));
        assertThat(shapes.get(1)).isEqualTo(clonedShapes.get(1));
        assertThat(shapes).isEqualTo(clonedShapes);
    }
}
