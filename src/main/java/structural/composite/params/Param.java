package structural.composite.params;

public enum Param {

    NAME("name"),
    NATIONALITY("nationality"),
    WIDTH("width"),
    AGE("age");

    private String param;

    Param(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }
}
