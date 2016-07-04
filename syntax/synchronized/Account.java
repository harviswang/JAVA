class Account {
	String name;
	float amount;
	
	/*
	 * DELAY_MILLISECOND线程延时大小,毫秒为单位
	 * 测试发现该值的大小会影响线程调度
	 */
	private static int DELAY_MILLISECOND = 0; 
	
	public Account(String name, float amount) {
		this.name = name;
		this.amount = amount;
	}
	
	synchronized public void deposit(float amt) {
		float tmp = amount;
		tmp += amt;
		
		try {
			Thread.sleep(DELAY_MILLISECOND);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		amount = tmp;
	}
	
	synchronized public void withdraw(float amt) {
		float tmp = amount;
		tmp -= amt;
		
		try {
			Thread.sleep(DELAY_MILLISECOND);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		amount = tmp;
	}
	
	public float getBalance() {
		return amount;
	}
}