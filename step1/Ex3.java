package JWD.step1;

public class Ex3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int S,P;

        if (a>0 && b>0) {
            P = (int) Math.sqrt((a * a + b * b)) + a + b;
            S = (a * b) / 2;
            System.out.print("Периметр равен " + P + " см.\nПлощадь равна " + S + " см2.");
        } else System.out.println("Такой треугольник не может существовать!");
    }
}
