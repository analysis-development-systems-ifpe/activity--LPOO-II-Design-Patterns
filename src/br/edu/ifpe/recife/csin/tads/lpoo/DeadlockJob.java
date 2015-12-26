package br.edu.ifpe.recife.csin.tads.lpoo;

public class DeadlockJob implements Runnable {
	
	
	private DeadLock deadLock;
	
	public DeadlockJob (DeadLock deadLock){
		this.deadLock = deadLock;
	}
	
	public void run(){
		deadLock.m1();
	}
	
	public static void main(String[] args) {
		DeadLock deadLock1 = new DeadLock();
		DeadLock deadLock2 = new DeadLock();
		deadLock1.setOther(deadLock2);
		deadLock2.setOther(deadLock1);
		DeadlockJob deadlockJob1 = new DeadlockJob(deadLock1);
		DeadlockJob deadlockJob2 = new DeadlockJob(deadLock2);
		
		Thread thread1 = new Thread(deadlockJob1);
		Thread thread2 = new Thread(deadlockJob2);

		thread1.start();
		thread2.start();

		
	}
}
