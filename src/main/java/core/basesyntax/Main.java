package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new ThreadTest(counter);
        thread.start();
        Runnable runnable = new RunnableTest(counter);
        new Thread(runnable).start();
    }
}
