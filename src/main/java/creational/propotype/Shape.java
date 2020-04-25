package creational.propotype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Shape {
    private String color;
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(Shape shape) {
        this.color = shape.color;
        this.x = shape.x;
        this.y = shape.y;
    }

    public abstract Shape cloneShape();

}
