public class liebre extends a {
    private int positionanimal;
    private boolean winnerhare = false;
    public liebre(int posicion){
        this.positionanimal = posicion;
    }

    public synchronized void s() throws InterruptedException{
        Thread.sleep(1000);
        notifyAll();
    }
    public synchronized void j() throws InterruptedException{
        Thread.sleep(1000);
        positionanimal = (positionanimal + 9);
        notifyAll();
    }
    public synchronized void dou() throws InterruptedException{
        Thread.sleep(1000);
        positionanimal = (positionanimal + 1);
        notifyAll();
    }

    public synchronized void fa() throws InterruptedException{
        Thread.sleep(1000);
        positionanimal = (positionanimal - 2);
        if(positionanimal < 1){
            positionanimal = 1;
        }
        notifyAll();
    }
    public synchronized void f() throws InterruptedException{
        Thread.sleep(1000);
        positionanimal = (positionanimal - 12);
        if(positionanimal < 1){
            positionanimal = 1;
        }
        notifyAll();
    }



    public synchronized boolean getWinnerhare(){
        if(positionanimal >= 70){
            winnerhare = true;
        }
        return winnerhare;
    }
    public synchronized int get() {
        notifyAll();
        return positionanimal;
    }
}