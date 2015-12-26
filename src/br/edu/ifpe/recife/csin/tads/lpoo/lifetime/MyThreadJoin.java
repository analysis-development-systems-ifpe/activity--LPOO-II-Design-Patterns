package br.edu.ifpe.recife.csin.tads.lpoo.lifetime;

public class MyThreadJoin {

	
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThreadJob(10));
		//Thread t2 = new Thread(new MyThreadJob(10));
		t1.start();
		//t2.start();
		try {
		t1.join();
		
		} catch (InterruptedException ex) {
		ex.printStackTrace();
		}
		System. out.println("Done");
		}
}
