package avaliacaocomplementar.hospital.areamedica.nucleo;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areamedica.Ortopedista;

public class NucleoOrtopedista implements EspecialistaFactory {



	@Override
	public Medico escalarEspecialista(int id,
			GerenciadorAtendimento gerenciadorAtendimento, int tempo) {
		// TODO Auto-generated method stub
		return  new Ortopedista(id, gerenciadorAtendimento, tempo);
	}

}
