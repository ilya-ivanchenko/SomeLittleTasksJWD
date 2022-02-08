package JWD.step1;

public class Ex5 {
    public static void main(String[] args) {
        double arr[] = new double[3];
        arr [0] = 5;
        arr [1] = 17.3;
        arr [2] = -3.0;

        for (double x: arr) {
            if (x < 0) x = Math.pow(x, 4);
            else x *=x;
            System.out.println(x);
        }
    }
}
