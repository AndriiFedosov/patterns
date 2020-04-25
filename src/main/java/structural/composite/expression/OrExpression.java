package structural.composite.expression;

import lombok.Builder;
import structural.composite.params.LogicalOperators;
@Builder
public class OrExpression implements Expression {
    @Builder.Default
    private LogicalOperators operator= LogicalOperators.OR;
    private String operation;

    @Override
    public String getLogicalOperator() {
        return operator.getOperator();
    }

    @Override
    public String getSearchOperationExpression() {
        return operation;
    }
}
