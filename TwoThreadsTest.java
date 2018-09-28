package data.structures;

public class TwoThreadsTest {
    public static void main(String[] args)throws Exception{
        new SimpleThread("PING").start();
        new SimpleThread("PONG").start();
    }
}
