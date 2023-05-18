public class MathOprations {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int result = 0;

        System.out.println("X :" + x);
        System.out.println("Y :" + y);

        result = x + y;
        System.out.println("Addition = " + result);
        result = x - y;
        System.out.println("Substraction = " + result);
        result = x * y;
        System.out.println("Multiplication = " + result);
        result = x / y;
        System.out.println("Division = " + result);
        result = x % y;
        System.out.println("Modulo = " + result);

    }
}
