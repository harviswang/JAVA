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
	
	/* synchronized */ public void deposit(float amt) {
//		float tmp = amount;
//		tmp += amt;
//
	    if (amt > 0.0) {
	        updateBalance(amt);
	    } else {
	        System.out.println("argument can not be negative");
	    }
		try {
			Thread.sleep((long)Math.random());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		amount = tmp;
	}
	
	/* synchronized */ public void withdraw(float amt) {
//		float tmp = amount;
//		tmp -= amt;
//		
       if (amt > 0.0) {
            updateBalance(-1.0f * amt);
        } else {
            System.out.println("argument can not be negative");
        }
		try {
			Thread.sleep((long)Math.random());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		
//		amount = tmp;
	}
	
	public float getBalance() {
		return amount;
	}
	
	synchronized public void updateBalance(float delta) {
	    amount += delta;
	}
}