package br.edu.ifpe.recife.csin.tads.lpoo.exercicio.e01;

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
			Thread t1 = new HelloWorldThread("thread 1 MIN PRIORITY");
			Thread t2 = new HelloWorldThread("thread 2 NORM PRIORITY");
			Thread t3 = new HelloWorldThread("thread 3 MAX PRIORITY");
			//Atribuindo prioridade
			t1.setPriority(MIN_PRIORITY);
			t2.setPriority(NORM_PRIORITY);
			t3.setPriority(MAX_PRIORITY);

			//Inicia a execução do método run
			t1.start();
			t2.start();
			t3.start();
			}

}
