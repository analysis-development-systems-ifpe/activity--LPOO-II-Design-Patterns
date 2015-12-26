package avaliacaocomplementar.hospital;

import avaliacaocomplementar.Cliente;
import avaliacaocomplementar.hospital.areamedica.EspecialistaEnum;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areapaciente.EstadoPacienteEnum;
import avaliacaocomplementar.hospital.areapaciente.Paciente;
import avaliacaocomplementar.hospital.areapaciente.TipoPacienteEnum;

public class GerenciadorAtendimentoClinicoSingleton {
	
	private static GerenciadorAtendimento gaClinico;
	
	  public static GerenciadorAtendimento getInstanciaClinico() {
	        if (gaClinico == null)
	        	gaClinico = new GerenciadorAtendimento();
	        return gaClinico;
	    }
	
}
