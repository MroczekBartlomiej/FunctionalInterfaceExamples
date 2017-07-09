import java.util.function.Function;

public class FunctionalInterface {

    public static void main(String[] args) {

        Function<Integer, Integer> factorial = (f) -> {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
            return result;
        };

        Function<Integer, String> numberChecker = (f) -> {
            String result = "Number is zero.";
            if (f > 0) {
                result = "Number is bigger than zero.";
            }else if(f <0){
                result = "Number is smaller than zero.";
            }
            return result;
        };

        System.out.println("Factorial of number " + 3 + " is " + factorial.apply(3));
        System.out.println("Factorial of number " + 4 + " is " + factorial.apply(4));
        System.out.println("Factorial of number " + 5 + " is " + factorial.apply(5));

        System.out.println(numberChecker.apply(2));
        System.out.println(numberChecker.apply(-1));
        System.out.println(numberChecker.apply(0));

    }
}
