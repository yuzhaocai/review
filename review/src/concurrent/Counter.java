package concurrent;

/**
 * 多线程并发计数器
 * @author Administrator
 *
 */
public class Counter {
	
	private static final Counter counter = new Counter();
	
	private volatile int value = 0;
	
	public synchronized int getValue(){
		return value;
	}
	
	public int increment(){
		return value++;
	}
	
	
	class CounterThread extends Thread{
		@Override
		public void run() {
			for(int i = 0;i<50;i++){
				int value = counter.increment();
				System.out.println(value);
			}
		}
	}
	
	
	public static void main(String[] args) {
		for(int i = 0;i < 5;i++){
			Thread t = counter.new CounterThread();
			t.start();
		}
	}
}
