public class GuessGame {

    Playar p1;
    Playar p2;
    Playar p3;

    public void startGame(){
        p1 = new Playar();
        p2 = new Playar();
        p3 = new Playar();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNamber = (int) (Math.random() *10);

        while (true){
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.namber;
            guessp2 = p2.namber;
            guessp3 = p3.namber;

            if (guessp1 == targetNamber){
                p1isRight = true;
            }

            if (guessp2 == targetNamber){
                p2isRight = true;
            }

            if (guessp3 == targetNamber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){

            }else {
                
            }
        }
    }

}

