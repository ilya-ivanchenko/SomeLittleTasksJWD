package JWD.step1;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double a,b,c,max, min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число:");
        a = sc.nextInt();
        System.out.print("Введите второе число:");
        b = sc.nextInt();
        System.out.print("Введите третье число:");
        c = sc.nextInt();

        max = Math.max(a,b);
        max = Math.max(max,c);

        min = Math.min(a,b);
        min = Math.min(min,c);

        System.out.println("Минимальное число: "  + min);
        System.out.println("Максимальное число: " + max);
    }
}
