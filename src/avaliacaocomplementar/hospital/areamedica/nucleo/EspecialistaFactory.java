package avaliacaocomplementar.hospital.areamedica.nucleo;

import avaliacaocomplementar.hospital.GerenciadorAtendimento;
import avaliacaocomplementar.hospital.areamedica.Medico;

public interface EspecialistaFactory {
	public Medico escalarEspecialista(int id, GerenciadorAtendimento gerenciadorAtendimento, int tempo);

}
