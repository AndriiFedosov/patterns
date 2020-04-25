package structural.composite.params;

public enum Operators {
    EQUAL("="),
    NOT_EQUAL("!="),
    GREAT_THEN(">"),
    LESS_THEN("<");

    private String operand;

    Operators(String operand) {
        this.operand = operand;
    }

    public String getOperand() {
        return operand;
    }
}
