package core.basesyntax;

import org.apache.log4j.Logger;

public class ThreadTest extends Thread {
    private static final Logger logger = Logger.getLogger(ThreadTest.class);
    private Counter counter;

    public ThreadTest(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isFinish()) {
            counter.countUp();
            logger.info(Thread.currentThread().getName() + " value = " + counter.getValue());
        }
    }
}
