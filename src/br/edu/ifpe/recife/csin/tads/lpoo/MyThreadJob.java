package br.edu.ifpe.recife.csin.tads.lpoo;

public class MyThreadJob implements Runnable {
	
	@Override
	public void run() {
	//O método estático recupera o thread corrente
	String threadName = Thread. currentThread().getName();
	for (int i = 0; i < 10000; i++)
	System. out.println(threadName + " running");
	}
	
	public static void main(String[] args) {
		MyThreadJob myThreadJob = new MyThreadJob();
		Thread t1 = new Thread(myThreadJob, "thread 1");
		Thread t2 = new Thread(myThreadJob, "thread 2");
		t1.start();
		t2.start();
		}

}
