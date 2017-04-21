package koocbor.org.cctest.models;

/**
 * Created by robcook on 4/20/17.
 */

public class TestModel {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String val) {
        this.value = val;
    }

    public int add(int a, int b) {
        return _addWithLambda(a, b, (x, y) -> {
            return x + y;
        });
    }

    private int _addWithLambda(int a, int b, Adder adder) {
        return adder.add(a, b);
    }

    interface Adder {
        int add(int a, int b);
    }
}
