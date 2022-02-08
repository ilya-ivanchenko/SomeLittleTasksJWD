package JWD.step1;

public class Ex4 {
    public static void main(String[] args) {
    int x,y;
    x=0;
    y=-1; //координаты точки

    if (((x>=-4 && x<=4) && (y>=-3 && y<=0)) || ((x>=-2 && x<=2) && (y>=0 && y<=4)))   //разбиваем на 2 области
        System.out.println("true");
        else System.out.println("false");
    }

}
