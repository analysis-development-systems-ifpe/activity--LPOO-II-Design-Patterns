package br.edu.ifpe.recife.csin.tads.lpoo;

public class CondicoesCorrida extends Thread{
	private int id;
	private static int n=0;
	public CondicoesCorrida(int id) {
		this.id = id;
	}
	
	public void run(){
		if(id %2 == 0){
			for (int i = 0; i < 10000; i++) 
				for (int j = 0; j < 100000; j++)
					n = n*2;
							
		}else{
			n = n+1;
		}
		
		System.out.println("Fim da execucao de " + id +". n = "+ n);
	}
	
	public static void main(String[] args) {
		CondicoesCorrida p1 = new CondicoesCorrida(1);
		CondicoesCorrida p2 = new CondicoesCorrida(2);
		p1.start();
		p2.start();

	}
	
	

}
