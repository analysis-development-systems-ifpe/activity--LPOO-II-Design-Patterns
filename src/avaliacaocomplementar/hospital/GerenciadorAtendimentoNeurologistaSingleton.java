package avaliacaocomplementar.hospital;

import avaliacaocomplementar.Cliente;
import avaliacaocomplementar.hospital.areamedica.EspecialistaEnum;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areapaciente.EstadoPacienteEnum;
import avaliacaocomplementar.hospital.areapaciente.Paciente;
import avaliacaocomplementar.hospital.areapaciente.TipoPacienteEnum;

public class GerenciadorAtendimentoNeurologistaSingleton {
	private static GerenciadorAtendimento gaNeurologista;
	
	  public static GerenciadorAtendimento getInstanciaClinico() {
	        if (gaNeurologista == null)
	        	gaNeurologista = new GerenciadorAtendimento();
	        return gaNeurologista;
	    }
}
