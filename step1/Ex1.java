package JWD.step1;

class Ex1 {
        public static void main(String[] args) {
                int a = 4361;
                int a0, a1, a2, a3;

                a0 = a/1000;
                a1 = (a - (a0*1000))/100;
                a2 =  (a - (a0*1000 + a1*100))/10;
                a3 = a - (a0*1000 + a1*100 + a2*10);

                if ((a0+a1) == (a2 + a3)) System.out.println("true");
                else System.out.println("false");

        }
}