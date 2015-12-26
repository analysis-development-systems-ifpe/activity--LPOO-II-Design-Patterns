package avaliacaocomplementar.hospital;

import avaliacaocomplementar.Cliente;
import avaliacaocomplementar.hospital.areamedica.EspecialistaEnum;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areapaciente.EstadoPacienteEnum;
import avaliacaocomplementar.hospital.areapaciente.Paciente;
import avaliacaocomplementar.hospital.areapaciente.TipoPacienteEnum;

public class GerenciadorAtendimentoGinecolistaSingleton {
	
			
	private static GerenciadorAtendimento gaGinecolista;
	
	  public static GerenciadorAtendimento getInstanciaClinico() {
	        if (gaGinecolista == null)
	        	gaGinecolista = new GerenciadorAtendimento();
	        return gaGinecolista;
	    }
	
}
