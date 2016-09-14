package sort;

public class Threads {
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				System.out.println("子线程："+this.getName());
			}
		}.start();;
		System.out.println("主线程！"+Thread.currentThread().getName());
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("子线程："+Thread.currentThread().getName());
			}
			
		}).start();;
	}
	
}
