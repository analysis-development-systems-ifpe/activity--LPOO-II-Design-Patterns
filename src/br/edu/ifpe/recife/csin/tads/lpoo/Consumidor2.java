package br.edu.ifpe.recife.csin.tads.lpoo;

public class Consumidor2 extends Thread {
	private CaixaCorreio2 caixaCorreio;

	public Consumidor2(CaixaCorreio2 caixa) {
		this.caixaCorreio = caixa;
	}

	public void run() {
		while (true) {
			String mensagem = caixaCorreio.obterMensagem();
			System.out.println(mensagem);
		}
	}
}
