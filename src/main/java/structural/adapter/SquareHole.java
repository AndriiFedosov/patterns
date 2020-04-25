package structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SquareHole {
    private double length;

    public double calculateSquare() {
        return length * length;
    }

}
