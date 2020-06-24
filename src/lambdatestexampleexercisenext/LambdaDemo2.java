package lambdatestexampleexercisenext;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isFactor = (n, m) -> (n % m) == 0;
        if (isFactor.test(10,2));{
            System.out.println("Number 2 is factor number 10.");
        };
        if (isFactor.test(10, 3));{
            System.out.println("Number 3 isn't factor number 10.");
        }
    }
}

interface NumericTest{
    boolean test(int n, int m);
}