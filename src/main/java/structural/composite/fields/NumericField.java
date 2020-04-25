package structural.composite.fields;

import structural.composite.params.Operators;
import structural.composite.params.Param;

public class NumericField extends BaseField {

    public NumericField(Param param) {
        super(param);
    }

    public String greatThen(Object value) {
        return getParam() + Operators.GREAT_THEN.getOperand() + value.toString();
    }

    public String lessThen(Object value){
        return getParam() + Operators.LESS_THEN.getOperand() + value.toString();

    }
}
