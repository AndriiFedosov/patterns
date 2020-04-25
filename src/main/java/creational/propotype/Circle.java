package creational.propotype;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    private Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this);
    }

}
