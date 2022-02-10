/* Код подготовил Иванченко Илья. */
package courses.JWD.step2;

public class Exercise4 {
    public static void main(String[] args) {

        /* Зададим координаты точки. */
        int x = 0;
        int y = -1;

        System.out.println("Полученное значение: " + Logics.result(x, y));
    }
}


class Logics {
    static boolean result(int i, int j) {

        /* Разобьем заданную область на две. */
        if (((i >= -4 && i <= 4) && (j >= -3 && j <= 0))
                || ((i >= -2 && i <= 2) && (j >= 0 && j <= 4))) {
            return true;
        } else {
            return false;
        }
    }
}

