package avaliacaocomplementar.hospital.areamedica.nucleo;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;
import avaliacaocomplementar.hospital.areamedica.Ginecolista;
import avaliacaocomplementar.hospital.areamedica.Medico;

public class NucleoGinecolista implements EspecialistaFactory {



	@Override
	public Medico escalarEspecialista(int id,
			GerenciadorAtendimento gerenciadorAtendimento, int tempo) {
		// TODO Auto-generated method stub
		return  new Ginecolista(id, gerenciadorAtendimento, tempo);
	}

}
