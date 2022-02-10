/* Код подготовил Иванченко Илья. */
package courses.JWD.step2;

public class Exercise9 {
    public static void main(String[] args) {
        int arrayFirst[] = {5, 96, 45, 25, 3, 15, 67};
        int arraySecond[] = {9, 89, 1, 5, 468};
        int k = 3;                                                  //номер заданного элемента

        Calc.newArray(arrayFirst, arraySecond, k);
    }
}


class Calc {
    static void newArray(int array1[], int array2[], int n) {


        int[] array3 = new int[array1.length + array2.length];


        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        /* копируем элементы из 2-ого массива в 3-ий, вставляя с 4-ого эл. */
        for (int j = 0; j < array2.length; j++) {
            array3[n++] = array2[j];
        }

        /* копируем элементы из 1-ого массива  в 3-ий, с 4-ого эл. */
        for (int l = n - array2.length; l < array1.length; l++) {
            array3[n++] = array1[l];
        }

        Result.show(array3);
    }
}


class Result {
    static void show(int array3[]) {
        System.out.println("Новый массив: ");
        for (int l : array3) {
            System.out.print(l + " ");
        }
    }
}