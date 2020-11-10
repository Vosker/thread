package core.basesyntax;

import org.apache.log4j.Logger;

public class RunnableTest implements Runnable {
    private static final Logger logger = Logger.getLogger(RunnableTest.class);
    private Counter counter;

    public RunnableTest(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isFinish()) {
            counter.countUp();
            logger.info(java.lang.Thread.currentThread().getName()
                    + " value = " + counter.getValue());
        }
    }
}
