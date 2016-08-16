all: Account.class  AccountTest.class

hide := @

Account.class: Account.java
	$(hide) javac Account.java
	
AccountTest.class: AccountTest.java
	$(hide) javac AccountTest.java
	
.PHONY: clean, run
run: Account.class  AccountTest.class
	$(hide) java AccountTest

clean:
	$(hide) rm *.class
