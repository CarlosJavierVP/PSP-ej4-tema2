public class Fibonacci {

    private int n;
    private int n1;
    private int n2;



    public Fibonacci(int n, int n1, int n2) {
        this.n = n;
        this.n1 = n-1;
        this.n2 = n-2;

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
