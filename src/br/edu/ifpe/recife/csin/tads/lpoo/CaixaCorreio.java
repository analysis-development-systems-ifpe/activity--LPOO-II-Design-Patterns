package br.edu.ifpe.recife.csin.tads.lpoo;

public class CaixaCorreio {
	public boolean novaMensagem;
	public String messagem;
	
	public static void main(String[] args) {
		CaixaCorreio caixa = new CaixaCorreio();
		Consumidor consumidor = new Consumidor(caixa);
		Produtor produtor = new Produtor(caixa);
		produtor.start();
		consumidor.start();
	}

}
