package lambdatestexampleexercisenext;

public class LambdaDemo3 {
    public static void main(String[] args) {

        StringTest isIn = (a, b) -> a.indexOf(b) !=-1;
        String string = "This is text.";

        System.out.println("Check the string. " + string);
        if (isIn.test(string, "is")){
            System.out.println("Found the string 'is'.");}
         else{
            System.out.println("Not found the string 'is'.");}

         if (isIn.test(string, "xyz")){
             System.out.println("Found the string 'xyz'.");
         } else {
             System.out.println("Not found the string 'xyz'.");
         }
    }
}

interface StringTest{
    boolean test(String text1, String text2);
}
