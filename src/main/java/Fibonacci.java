public class Fibonacci implements Runnable {

    private int n;
    private int n1;
    private int n2;

    public Fibonacci(int n) {
        this.n = n;
        this.n1 = n-1;
        this.n2 = n-2;

    }

    @Override
    public void run() {
        if (n < 2){
            n1 = 1;
            n2 = 0;
        }else{
            Fibonacci fibo = new Fibonacci(n - 1);
            Thread t = new Thread(fibo);
            t.start();
            while(t.isAlive()){}
            n1 = fibo.getN1() + fibo.getN2();
            n2 = fibo.getN1();
            System.out.println(n1);


        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }



}
