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
        System.out.println();

        NumericTest lessThan = (n, m) -> (n < m);
        if (lessThan.test(2, 10));{
            System.out.println("Number 2 is less than number 10.");
        };
        if (!lessThan.test(10, 2));{
            System.out.println("Number 10 isn't less than number 2.");
        }
        System.out.println();

        NumericTest abcEquals = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if (abcEquals.test(4, -4));{
            System.out.println("Absolute value 4 and -4 are equals.");
        };
        if (!abcEquals.test(4, -5));{
            System.out.println("Absolute value 4 and -5 aren't equals.");
        }
    }
}

interface NumericTest{
    boolean test(int n, int m);
}