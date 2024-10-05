public class Main {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci(8);

        Thread t = new Thread(fibo);
        t.start();

    }
}
