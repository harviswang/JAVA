/*
 * synchronized给出的答案是在软件层面依赖JVM，而Lock给出的方案是在硬件层面依赖特殊的CPU指令
 * synchronized应用层的语义是可以把任何一个非null对象作为"锁"，
 * 1. 当synchronized作用在方法上时，锁住的便是对象实例（this）
 * 2. 当作用在静态方法时锁住的便是对象对应的Class实例，因为Class数据存在于永久带，因此静态方法锁相当于该类的一个全局锁
 * 3. 当synchronized作用于某一个对象实例时，锁住的便是对应的代码块
 */
        
public class AccountTest {
	private static int NUM_OF_THREAD = 1000;
	static Thread[] threads = new Thread[NUM_OF_THREAD];
	
	public static void main(String[] args) {
		final Account acc = new Account("John", 1000.0f);
		for (int i = 0; i < NUM_OF_THREAD; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
					acc.deposit(100.0f);
					acc.withdraw(100.0f);
				}
			});
			threads[i].start();
		}
		
		for (int i = 0; i < NUM_OF_THREAD; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Finally, John's balance is: " + acc.getBalance());
	}
}