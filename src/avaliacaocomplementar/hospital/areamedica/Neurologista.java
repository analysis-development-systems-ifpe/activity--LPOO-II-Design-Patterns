package avaliacaocomplementar.hospital.areamedica;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;

public class Neurologista extends Medico{
	
	public static final String ESPECIALIDADE = "NEUROLOGISTA"; 


	public Neurologista(int idMedico, GerenciadorAtendimento salaAtendimento,
			int tempoMedioAtendimento) {
		super(idMedico, salaAtendimento, tempoMedioAtendimento,ESPECIALIDADE);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void exibirInfo() {
		// TODO Auto-generated method stub
		System.out.println("Medico " + super.getTipoEspecialista() + " # " + super.getIdMedico());
	}
}
