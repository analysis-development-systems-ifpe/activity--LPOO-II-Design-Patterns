package br.edu.ifpe.recife.csin.tads.lpoo;

public class ProgramaSequencial{ 
	private String nome;
	private int n;
	
	
	
	public ProgramaSequencial(String nome, int n) {
	
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
		ProgramaSequencial p1 = new ProgramaSequencial("p1", 17);
		ProgramaSequencial p2 = new ProgramaSequencial("p2", 19);
		
		p1.run();
		p2.run();
	}
}
