public class a {

    static turtle tortuga = new turtle(1);
    static liebre liebre = new liebre(1);


    public static void main(String[] args) throws InterruptedException {
        boolean fin = false;
        while(!fin){
            int po1 = (int) ((Math.random()*100)+1);
            int po2 = (int) ((Math.random()*100)+1);



            liebre(po1);
            tortuga(po2);


            int p1 = liebre.get();
            int p2 = tortuga.get();

            for(int i = 0; i < p1; i++){
                System.out.print(" ");
            }
            System.out.println("liebre");
            System.out.println(po1);

            for(int i = 0; i < p2; i++){
                System.out.print(" ");
            }
            System.out.println("tortuga");
            System.out.println(po2);

            boolean hare = liebre.getWinnerhare();
            boolean t = tortuga.getWinnerturtle();
            if(hare && t){
                System.out.println("Queda empate la carrera");
                fin = true;
            }
            else if(hare){
                System.out.println("Gana la liebre");
                fin = true;
            }
            else if(t){
                System.out.println("Gana la tortuga");
                fin = true;
            }
        }
    }
    public static void liebre(int valor) throws InterruptedException {
        if(0 <= valor && valor <= 20){
            liebre.s();
        }
        else if(21 <= valor && valor <= 40){
            liebre.j();
        }
        else if(41 <= valor && valor <= 50){
            liebre.f();
        }
        else if(51 <= valor && valor <= 80){
            liebre.dou();
        }
        else{
            liebre.fa();
        }
    }

    public static void tortuga(int valor) throws InterruptedException{
        if(0 <= valor && valor <= 50){
            tortuga.go();
        }
        else if(51 <= valor && valor <= 70) {
            tortuga.fall();
        }
        else if(71 <= valor && valor <= 100){
            tortuga.go2();
        }
    }
}