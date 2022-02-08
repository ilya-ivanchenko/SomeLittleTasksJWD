package JWD.step1;

public class Ex2 {
    public static void main(String[] args) {
       int result;
        int a=2;
        int b=7;
        int c=3;

        result = (int) ((Math.sqrt(b*b + 4*a*c))/(2*a) - Math.pow(a,3)*c+Math.pow(b,-2));

        System.out.println("Результат вычислений: " + result);
    }
}
