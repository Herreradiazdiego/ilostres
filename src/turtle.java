public class turtle extends a {
    private int posicion;
    private boolean winnerturtle = false;
    public turtle(int posicion){
        this.posicion = posicion;
    }

    public synchronized void go2() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion + 3);
        notifyAll();
    }
    public synchronized void go() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion + 3);
        notifyAll();
    }

    public synchronized int get() {
        notifyAll();
        return posicion;
    }
    public synchronized boolean getWinnerturtle(){
        if(posicion >= 70){
            winnerturtle = true;
        }
        return winnerturtle;
    }

    public synchronized void fall() throws InterruptedException{
        Thread.sleep(1000);
        posicion = (posicion - 6);
        if(posicion < 1){
            posicion = 1;
        }
        notifyAll();
    }
}