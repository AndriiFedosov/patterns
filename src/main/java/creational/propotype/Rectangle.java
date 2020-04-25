package creational.propotype;

import lombok.Data;

import java.util.Objects;

@Data
public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    private Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    @Override
    public Shape cloneShape() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length &&
                width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
