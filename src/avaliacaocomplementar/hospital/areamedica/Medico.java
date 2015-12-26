package avaliacaocomplementar.hospital.areamedica;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;

public abstract class Medico extends Thread {

	
	private int idMedico;
	private GerenciadorAtendimento salaAtendimento;
	private int tempoMedioAtendimento;
	private String tipoEspecialista;
	

	

	public void run() {

		while (true) {

			try {
				Thread.sleep(tempoMedioAtendimento * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			salaAtendimento.get( this);

			// System.out.println("MedicoAnt"+ especialidade.typeInfo() + "#" +
			// idMedico + " atendimento concluído");

		}

	}

	public Medico(int idMedico, GerenciadorAtendimento salaAtendimento,
			int tempoMedioAtendimento, String especialidade) {
		super();
		this.idMedico = idMedico;
		this.salaAtendimento = salaAtendimento;
		this.tempoMedioAtendimento = tempoMedioAtendimento;
		this.tipoEspecialista = especialidade;
	}
	
	protected abstract void exibirInfo();

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	public int getTempoMedioAtendimento() {
		return tempoMedioAtendimento;
	}

	public void setTempoMedioAtendimento(int tempoMedioAtendimento) {
		this.tempoMedioAtendimento = tempoMedioAtendimento;
	}


	public String getTipoEspecialista() {
		return tipoEspecialista;
	}

	public void setTipoEspecialista(String tipoEspecialista) {
		this.tipoEspecialista = tipoEspecialista;
	}
	
	public String toString(){
		return "AGENT: Médico # ID:" + getIdMedico() +" ESPECIALISTA: " + getTipoEspecialista();
	}
}
