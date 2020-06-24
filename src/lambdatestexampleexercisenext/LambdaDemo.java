package lambdatestexampleexercisenext;

public class LambdaDemo {
    public static void main(String[] args) {
    MyValue myValue = () -> 98.5;

        System.out.println("Value fixed: " + myValue.getValue());

    MyParamValue myParamValue = (n) -> 1.0 / n;

        System.out.println("Value inverse number 4: " + myParamValue.getValue(4));
        System.out.println("Value inverse number 8: " + myParamValue.getValue(8));


    }
}

interface MyValue{
    double getValue();
}

interface MyParamValue{
    double getValue(double v);
}

