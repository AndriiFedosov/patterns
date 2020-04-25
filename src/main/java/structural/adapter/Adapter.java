package structural.adapter;

public class Adapter implements Shape {
    private SquareHole hole;
    private RoundPeg roundPeg;

    public Adapter(SquareHole hole, RoundPeg peg) {
        this.hole = hole;
        this.roundPeg = peg;
    }

    @Override
    public double getRadius() {
        double half = hole.getLength() / 2;
        return Math.sqrt((half * half) * 2);
    }

    public boolean canBeAdapted() {
        return getRadius() >= roundPeg.getRadius();
    }


}
