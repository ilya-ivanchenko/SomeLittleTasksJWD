package JWD.step1;

public class Ex7 {
    public static void main(String[] args) {
        double y;
        int a = 1;
        int b = 5; //отрезок  [a,b]
        double h = 0.25;

        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("-------------------------");

        for (double x=a; x<=b; x+=h) {
            y = Math.pow(Math.sin(x),2) - Math.cos(2*x);
            System.out.printf("|\t%4.2f\t|\t%4.2f\t|\n", x, y);
        }
        System.out.println("-------------------------");
    }
}
