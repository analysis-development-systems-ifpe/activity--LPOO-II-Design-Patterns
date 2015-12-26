package br.edu.ifpe.recife.csin.tads.lpoo;

public class Consumidor extends Thread {
	private CaixaCorreio caixaCorreio;

	public Consumidor(CaixaCorreio caixa) {
		this.caixaCorreio = caixa;
	}

	public void run() {
		while (true) {
			if (caixaCorreio.novaMensagem) {
				System.out.println(caixaCorreio.messagem);
				caixaCorreio.novaMensagem = false;
			}

			try {
				sleep(50);
			} catch (InterruptedException e) {

			}
		}
	}
}
