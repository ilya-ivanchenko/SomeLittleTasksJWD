package JWD.step1;

public class Ex8 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,9,6,8,12,19,20,165};
        int k=3;
        int sum = 0;

        for(int x: arr) {
            if (x%k ==0)  sum +=x;
        }
        System.out.println("Сумма всех чисел, которые делятся на " + k  + " = " + sum);
    }
}
