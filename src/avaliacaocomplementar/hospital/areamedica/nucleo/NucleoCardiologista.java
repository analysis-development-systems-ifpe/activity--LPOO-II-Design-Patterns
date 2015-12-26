package avaliacaocomplementar.hospital.areamedica.nucleo;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;
import avaliacaocomplementar.hospital.areamedica.Cardiologista;
import avaliacaocomplementar.hospital.areamedica.Medico;

public class NucleoCardiologista implements EspecialistaFactory {



	@Override
	public Medico escalarEspecialista(int id,
			GerenciadorAtendimento gerenciadorAtendimento, int tempo) {
		// TODO Auto-generated method stub
		return  new Cardiologista(id, gerenciadorAtendimento, tempo);
	}

}
