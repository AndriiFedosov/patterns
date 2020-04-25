package structural.composite.params;

public enum  LogicalOperators {
    AND(" && "),
    OR (" || ");

    private String operator;

    LogicalOperators(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
