package br.edu.ifpe.recife.csin.tads.lpoo;

public class HelloWorldThread extends Thread {
	
	
		public HelloWorldThread(String name) {
		super(name);
		}
		@Override
		public void run() {
		for (int i = 0; i < 10000; i++)
		System. out.println(super.getName() + " running");
		}
		
		public static void main(String[] args) {
			//Instancia duas instância de Thread
			Thread t1 = new HelloWorldThread("thread 1");
			Thread t2 = new HelloWorldThread("thread 2");
			//Inicia a execução do método run
			t1.start();
			t2.start();
			}

}
