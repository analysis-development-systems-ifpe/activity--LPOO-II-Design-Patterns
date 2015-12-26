package avaliacaocomplementar.hospital.areapaciente;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;

public class Paciente extends Thread {
	
	private String id; 
	private int prioridade;
	private int classificacao;
	
	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	private GerenciadorAtendimento salaAtendimento;
	
	private int numSintomas;
	
	public Paciente(String id,int prioridade, int classifcacao,GerenciadorAtendimento  salaAtendimento) {
		this.id = id;
		this.prioridade = prioridade;
        this.classificacao = classifcacao;
        this.salaAtendimento = salaAtendimento;
      //  this.numSintomas = numSintomas;
    }
 
    public void run() {
        System.out.println(this.toString() + " aguardando atendimento...");
        	try {
        		setPriority(this.getPrioridade() * this.getClassificacao());
				sleep(2000);
				
			 	salaAtendimento.set(this );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       

        
    }
	
    public String toString(){
    	
    	return "AGENT: Paciente # ID: " + getId() + "# Priority: " + getPriority();
    }
	
}
