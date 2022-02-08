package JWD.step1;

public class Ex9 {
    public static void main(String[] args) {
        int a[] = {5, 96, 45, 25, 3, 15, 67};
        int b[] = {9, 89, 1, 5, 468};
        int k = 3;
        int al = a.length;
        int bl = b.length;

        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            c[k++] = b[j];
        }

        for (int l = k-b.length; l < a.length; l++) {
            c[k++] = a[l];
        }

        System.out.println("Новый массив: ");
            for (int m : c) {
                System.out.print(m + " ");
            }
        }
   }

