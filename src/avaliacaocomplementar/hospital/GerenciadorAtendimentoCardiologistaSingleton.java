package avaliacaocomplementar.hospital;

import avaliacaocomplementar.Cliente;
import avaliacaocomplementar.hospital.areamedica.EspecialistaEnum;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areapaciente.EstadoPacienteEnum;
import avaliacaocomplementar.hospital.areapaciente.Paciente;
import avaliacaocomplementar.hospital.areapaciente.TipoPacienteEnum;

public class GerenciadorAtendimentoCardiologistaSingleton {
	
	private  static GerenciadorAtendimento gaCardiologista;
	
	  public  static GerenciadorAtendimento getInstanciaClinico() {
	        if (gaCardiologista == null)
	        	gaCardiologista = new GerenciadorAtendimento();
	        return gaCardiologista;
	    }
}
