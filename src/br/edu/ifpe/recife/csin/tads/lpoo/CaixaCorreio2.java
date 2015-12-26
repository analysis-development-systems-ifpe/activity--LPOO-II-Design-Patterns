package br.edu.ifpe.recife.csin.tads.lpoo;

public class CaixaCorreio2 {
	public boolean novaMensagem;
	public String messagem;
	
	public synchronized void armazenarMensagem(String mensagem){
		
		while(novaMensagem ==true){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		novaMensagem = true;
		this.messagem = mensagem;
		notify();
	}
	
public synchronized String obterMensagem(){
		
		while(novaMensagem ==false){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		novaMensagem = false;
		notify();
		return messagem;
	}
	
	public static void main(String[] args) {
		CaixaCorreio2 caixa = new CaixaCorreio2();
		Consumidor2 consumidor = new Consumidor2(caixa);
		Produtor2 produtor = new Produtor2(caixa);
		produtor.start();
		consumidor.start();
		/*Produtor2 produtor2 = new Produtor2(caixa);
		produtor2.start();*/

	}

}
