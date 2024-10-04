public class Fibonacci implements Runnable {

    private int n;
    private int n1;
    private int n2;



    public Fibonacci(int n, int n1, int n2) {
        this.n = n;
        this.n1 = n-1;
        this.n2 = n-2;

    }


    @Override
    public void run() {
        if (n < 2){
            n1 = 1;
            n2 = 0;
        }
    }
}
