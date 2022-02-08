package JWD.step1;

public class Ex2 {
    public static void main(String[] args) {
       int result=0;
        int a=2;
        int b=7;
        int c=3;

        if (a>0 && b>0 && c>0) {
            result = (int) ((Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
            System.out.println("Результат вычислений: " + result);
        } else System.out.println("Неверные исходные данные");
    }

}
