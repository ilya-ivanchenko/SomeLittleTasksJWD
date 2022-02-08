package JWD.step1;

public class Ex10 {
    public static void main(String[] args) {
        int arr[][] = new int [8][8];
        int b,c,d;


        for (b = 0; b<arr.length; b++) {
            if (b%2 == 0) {
                c = b;
                for (d = 0; d < arr.length; d++) {
                    arr[b][d] = ++c;
                }
            }
        }

        for (b=0; b<arr.length; b++) {
            System.out.println();
            for(d=0; d< arr.length; d++) {
                System.out.print(arr[b][d] + " ");
            }
        }
    }
}
