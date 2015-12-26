package br.edu.ifpe.recife.csin.tads.lpoo;

public class Produtor extends Thread {
	private CaixaCorreio caixaCorreio;
	public Produtor(CaixaCorreio caixa ){
		this.caixaCorreio =  caixa;
	}
	
	public void run(){
		
		int i = 0;
		while(true){
		i++;
		caixaCorreio.novaMensagem = true;
		caixaCorreio.messagem = "Mensagem "+ i + "...";
		
		}
	}
}
	