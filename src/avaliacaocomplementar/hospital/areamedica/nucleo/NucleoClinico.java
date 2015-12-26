package avaliacaocomplementar.hospital.areamedica.nucleo;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;
import avaliacaocomplementar.hospital.areamedica.Clinico;
import avaliacaocomplementar.hospital.areamedica.Medico;

public class NucleoClinico implements EspecialistaFactory {



	@Override
	public Medico escalarEspecialista(int id,
			GerenciadorAtendimento gerenciadorAtendimento, int tempo) {
		// TODO Auto-generated method stub
		return  new Clinico(id, gerenciadorAtendimento, tempo);
	}

}
