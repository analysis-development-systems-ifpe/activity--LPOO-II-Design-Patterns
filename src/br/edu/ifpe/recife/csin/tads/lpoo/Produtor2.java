package br.edu.ifpe.recife.csin.tads.lpoo;

public class Produtor2 extends Thread {
	private CaixaCorreio2 caixaCorreio;
	public Produtor2(CaixaCorreio2 caixa) {
		this.caixaCorreio = caixa;
	}

	public void run() {

		int i = 0;

		while (true) {
			this.setPriority(NORM_PRIORITY);
			i++;
			caixaCorreio.armazenarMensagem("Mensagem " + i + "...");

			try {
				sleep(500);
			} catch (InterruptedException e) {

			}

		}
	}
}
