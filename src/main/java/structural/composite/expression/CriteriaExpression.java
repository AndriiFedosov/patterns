package structural.composite.expression;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class CriteriaExpression {
    private List<Expression> expressions = new ArrayList<>();

    public CriteriaExpression add(Expression... expressions) {
        this.expressions.addAll(Arrays.asList(expressions));
        return this;
    }

    public String creteSearchString() {
        StringBuilder builder = new StringBuilder();
        expressions = expressions.stream().sorted(Comparator.comparing(Expression::getLogicalOperator)).collect(toList());
        ListIterator<Expression> iterator = expressions.listIterator();
        builder.append("(");
        while (iterator.hasNext()) {
            Expression current = iterator.next();
            builder.append(current.getSearchOperationExpression());
            if (iterator.hasNext()) {
                Expression next = iterator.next();
                if (!current.getLogicalOperator().equals(next.getLogicalOperator())) {
                    builder.append(")");
                }
                builder.append(next.getLogicalOperator());
                if (!current.getLogicalOperator().equals(next.getLogicalOperator())) {
                    builder.append("(");
                }
                iterator.previous();
            }
        }
        builder.append(")");
        return builder.toString();
    }
}
