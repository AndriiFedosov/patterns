package structural.composite.expression;

import lombok.Builder;
import structural.composite.params.LogicalOperators;

@Builder
public class AndExpression implements Expression {
    @Builder.Default
    private LogicalOperators operator = LogicalOperators.AND;
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
