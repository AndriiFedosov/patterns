package structural.composite.fields;

import structural.composite.params.Operators;
import structural.composite.params.Param;

public class BaseField {
    private Param param;

    public BaseField(Param param) {
        this.param = param;
    }

    public String eq(Object value) {
        return param.getParam() + Operators.EQUAL.getOperand() + value.toString();
    }

    public String notEq(Object value) {
        return param.getParam() + Operators.NOT_EQUAL.getOperand() + value.toString();
    }

    public String getParam() {
        return param.getParam();
    }

}