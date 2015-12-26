package br.edu.ifpe.recife.csin.tads.lpoo;

public class ProgramaConcorrente extends Thread{ 
	private String nome;
	private int n;
	
	
	
	public ProgramaConcorrente(String nome, int n) {
	
		this.nome = nome;
		this.n = n;
	}
	
		
		
		public void run() {
		//O método estático recupera o thread corrente
		String threadName = Thread. currentThread().getName();
		for (int i = 0; i < n; i++)
		System. out.println(nome + ": " + i + "; ");
		}



	public static void main(String[] args) {
		ProgramaConcorrente p1 = new ProgramaConcorrente("p1", 1);
		ProgramaConcorrente p2 = new ProgramaConcorrente("p2", 1);
		p2.setPriority(MAX_PRIORITY);
		p1.start();
		p2.start();
	}
}
