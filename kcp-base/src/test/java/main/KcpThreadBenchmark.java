package main;

import io.netty.buffer.ByteBuf;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Setup;
import threadPool.thread.DisruptorSingleExecutor;
import threadPool.thread.IMessageExecutor;

import java.util.Queue;

/**
 * Created by JinMiao
 * 2020/5/20.
 */
public class KcpThreadBenchmark {

    private Queue<Long> recieveList;
    public static final int PRODUCER_THREADS_NUMBER = 4;

    private IMessageExecutor iMessageExecutor;
    @Setup(Level.Trial)
    public void setUp() {
        iMessageExecutor = new DisruptorSingleExecutor("");
        //recieveList = new SpscArrayQueue<>(2<<11);


    }

}
