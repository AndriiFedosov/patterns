package structural.composite.fields;

import structural.composite.params.Param;

public class SearchField {
    public static final NumericField AGE = new NumericField(Param.AGE);
    public static final NumericField WIDTH = new NumericField(Param.WIDTH);
    public static final BaseField NAME = new BaseField(Param.NAME);
    public static final BaseField NATIONALITY = new BaseField(Param.NATIONALITY);
}
