package avaliacaocomplementar.hospital;

import avaliacaocomplementar.Cliente;
import avaliacaocomplementar.hospital.areamedica.EspecialistaEnum;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areapaciente.EstadoPacienteEnum;
import avaliacaocomplementar.hospital.areapaciente.Paciente;
import avaliacaocomplementar.hospital.areapaciente.TipoPacienteEnum;

public class GerenciadorAtendimentoOrtopedistaSingleton {
	
	
	private static GerenciadorAtendimento gaOrtopedista;
	
	  public static GerenciadorAtendimento getInstanciaClinico() {
	        if (gaOrtopedista == null)
	        	gaOrtopedista = new GerenciadorAtendimento();
	        return gaOrtopedista;
	    }
	
}
