class Account {
	String name;
	float amount;
	
	public Account(String name, float amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public void deposit(float amt) {
		float tmp = amount;
		tmp += amt;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		amount = tmp;
	}
	
	public void withdraw(float amt) {
		float tmp = amount;
		tmp -= amt;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		amount = tmp;
	}
	
	public float getBalance() {
		return amount;
	}
}