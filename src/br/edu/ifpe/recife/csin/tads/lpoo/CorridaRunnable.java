package br.edu.ifpe.recife.csin.tads.lpoo;

public class CorridaRunnable implements Runnable {
	private int value;

	public int getValue() {
	
		return value;
	}

	
	
	public  void increment() {
		// TODO Auto-generated method stub
		int i =value;
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.printf("Thread Name: "+ Thread.currentThread().getName() + "|Valor no runnable = %d \n", this.getValue());
		value = i+1;
	}
	
	public static void main(String[] args) {
		CorridaRunnable r1 = new CorridaRunnable();
				Thread td1 = new Thread(r1, "Thread 1");
				Thread td2 = new Thread(r1, "Thread 2");
				
				td1.start();
				td2.start();
				
				try{
					td1.join();
					td2.join();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.printf("Valor no runnable = %d \n", r1.getValue());
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			increment();
		}
	}
}
