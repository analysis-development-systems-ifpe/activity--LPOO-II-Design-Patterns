package br.edu.ifpe.recife.csin.tads.lpoo.lifetime;

public class MyThreadJob implements Runnable {
	private long sleepTime;
	public MyThreadJob(long sleepTime) {
	this.sleepTime = sleepTime;
	}
	
	
	@Override
	public void run() {
	//O método estático recupera o thread corrente
	String threadName = Thread. currentThread().getName();
	for (int i = 0; i < 10; i++) {
		System.out.println(threadName + " running");
		try {
		Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}

	}
	}
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThreadJob(1000), "thread 1");
		Thread t2 = new Thread(new MyThreadJob(500), "thread 2");
		t1.start();
		t2.start();
		}

}
