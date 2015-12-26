package avaliacaocomplementar.hospital.areamedica.nucleo;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areamedica.Neurologista;

public class NucleoNeurologista implements EspecialistaFactory {



	@Override
	public Medico escalarEspecialista(int id,
			GerenciadorAtendimento gerenciadorAtendimento, int tempo) {
		// TODO Auto-generated method stub
		return  new Neurologista(id, gerenciadorAtendimento, tempo);
	}

}
