package avaliacaocomplementar;

public class Cliente {
	private String nome;
	private int anoNasc;
	
	
	public Cliente(String nome, int anoNasc) {
		super();
		this.nome = nome;
		this.anoNasc = anoNasc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public String toString(){
		return getNome() +getAnoNasc();
	}
	
}
