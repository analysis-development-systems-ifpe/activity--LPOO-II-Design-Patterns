package avaliacaocomplementar.hospital;

import avaliacaocomplementar.hospital.areamedica.EspecialistaEnum;

public class GerenciadorAtendimentoFactory {

	public static GerenciadorAtendimento getFilaEspecialista(EspecialistaEnum e) {

		switch (e) {
		case CARDIOLOGISTA:

			return GerenciadorAtendimentoCardiologistaSingleton.getInstanciaClinico();

			case CLINICO:

			return GerenciadorAtendimentoClinicoSingleton.getInstanciaClinico();

		case GINECOLISTA:

			return GerenciadorAtendimentoGinecolistaSingleton.getInstanciaClinico();
		case NEUROLOGISTA:

			return GerenciadorAtendimentoNeurologistaSingleton.getInstanciaClinico();

		case ORTOPEDISTA:
			return GerenciadorAtendimentoOrtopedistaSingleton.getInstanciaClinico();
		default:
			return null;
		}
	}
}