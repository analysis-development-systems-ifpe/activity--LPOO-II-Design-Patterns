package avaliacaocomplementar.hospital;

import avaliacaocomplementar.hospital.areamedica.EspecialistaEnum;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areamedica.nucleo.NucleoCardiologista;
import avaliacaocomplementar.hospital.areamedica.nucleo.NucleoClinico;
import avaliacaocomplementar.hospital.areamedica.nucleo.NucleoGinecolista;
import avaliacaocomplementar.hospital.areamedica.nucleo.NucleoNeurologista;
import avaliacaocomplementar.hospital.areamedica.nucleo.NucleoOrtopedista;
import avaliacaocomplementar.hospital.areapaciente.EstadoPacienteEnum;
import avaliacaocomplementar.hospital.areapaciente.Paciente;
import avaliacaocomplementar.hospital.areapaciente.TipoPacienteEnum;

public class FachadaHospital {
	
	private static FachadaHospital  fachadaHospital;
	
	  public static FachadaHospital getInstancia() {
	        if (fachadaHospital == null)
	        	fachadaHospital = new FachadaHospital();
	        return fachadaHospital;
	    }
	  
	  

	public void  loadPacientes( Object[][]  fichaCliente){
		  
		for (int i = 0; i < fichaCliente.length; i++) {
			
			
			String nomePaciente = 	(String) fichaCliente[i][0];
			EspecialistaEnum especialidade  = 	((EspecialistaEnum) fichaCliente[i][1]);
			int tipoPaciente = 	((TipoPacienteEnum) fichaCliente[i][2]).ordinal() +1;
			int estadoPaciente = 	((EstadoPacienteEnum) fichaCliente[i][3]).ordinal()+1;
			
			
			//ThreadGroup clinico = new ThreadGroup("clinico");
			Thread p =  new Thread(new Paciente(nomePaciente, estadoPaciente, tipoPaciente, GerenciadorAtendimentoFactory.getFilaEspecialista(especialidade)));
			//listThread.add(p);
			System.out.println(tipoPaciente *estadoPaciente);
			p.start();
			//p.setPriority(tipoPaciente *estadoPaciente );
			
		
			
		}
	  }
	
	public void loadMedicos(){
		Medico medicoClinicoA = new NucleoClinico().escalarEspecialista(1,GerenciadorAtendimentoFactory.getFilaEspecialista(EspecialistaEnum.CLINICO), 3);
		Medico medicoClinicoB = new NucleoClinico().escalarEspecialista(2,GerenciadorAtendimentoFactory.getFilaEspecialista(EspecialistaEnum.CLINICO), 9);
		Medico medicoOrtopedista = new NucleoOrtopedista().escalarEspecialista(11,GerenciadorAtendimentoFactory.getFilaEspecialista(EspecialistaEnum.ORTOPEDISTA), 3);
		Medico medicoGinecolista = new NucleoGinecolista().escalarEspecialista(21,GerenciadorAtendimentoFactory.getFilaEspecialista(EspecialistaEnum.GINECOLISTA), 9);
		Medico medicoCardiologista = new NucleoCardiologista().escalarEspecialista(31,GerenciadorAtendimentoFactory.getFilaEspecialista(EspecialistaEnum.CARDIOLOGISTA), 3);
		
		Medico medicoNeurologista = new NucleoNeurologista().escalarEspecialista(41,GerenciadorAtendimentoFactory.getFilaEspecialista(EspecialistaEnum.NEUROLOGISTA), 3);



		
		medicoClinicoA.start();
		medicoClinicoB.start();
		
		medicoOrtopedista.start();
		medicoGinecolista.start();
		medicoCardiologista.start();
		medicoNeurologista.start();
		
	}

	public static void main(String[] args) {

		 Object[][]  fichaCliente;
		   {
				  fichaCliente = new Object[][] {
						  {"Test1", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test2", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test3", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test4", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test5", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test6", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test7", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test8", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test9", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test11", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test12", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test13", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test14", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test15", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test16", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test17", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test18", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test19", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test21", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test22", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test23", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test24", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test25", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test26", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test27", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test28", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test29", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test31", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test32", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test33", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test34", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test35", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test36", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test37", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test38", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test39", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test41", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test42", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test43", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test44", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test45", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test46", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test47", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test48", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test49", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test51", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test52", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test53", EspecialistaEnum.CLINICO, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test54", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test55", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test56", EspecialistaEnum.CLINICO, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test57", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test58", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test59", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test1", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test2", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test3", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test4", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test5", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test6", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test7", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test8", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test9", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test11", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test12", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test13", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test14", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test15", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test16", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test17", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test18", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test19", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test21", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test22", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test23", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test24", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test25", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test26", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test27", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test28", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test29", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test31", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test32", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test33", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test34", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test35", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test36", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test37", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test38", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test39", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test41", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test42", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test43", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test44", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test45", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test46", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test47", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test48", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test49", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test51", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test52", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test53", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test54", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test55", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test56", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test57", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test58", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test59", EspecialistaEnum.CARDIOLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test1", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test2", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test3", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test4", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test5", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test6", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test7", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test8", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test9", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test11", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test12", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test13", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test14", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test15", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test16", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test17", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test18", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test19", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test21", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test22", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test23", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test24", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test25", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test26", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test27", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test28", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test29", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test31", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test32", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test33", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test34", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test35", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test36", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test37", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test38", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test39", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test41", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test42", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test43", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test44", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test45", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test46", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test47", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test48", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test49", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test51", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test52", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test53", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test54", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test55", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test56", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test57", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test58", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test59", EspecialistaEnum.GINECOLISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test1", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test2", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test3", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test4", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test5", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test6", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test7", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test8", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test9", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test11", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test12", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test13", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test14", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test15", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test16", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test17", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test18", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test19", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test21", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test22", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test23", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test24", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test25", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test26", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test27", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test28", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test29", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test31", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test32", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test33", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test34", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test35", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test36", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test37", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test38", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test39", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test41", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test42", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test43", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test44", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test45", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test46", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test47", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test48", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test49", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test51", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test52", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test53", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test54", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test55", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test56", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test57", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test58", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test59", EspecialistaEnum.NEUROLOGISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test1", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test2", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test3", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test4", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test5", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test6", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test7", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test8", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test9", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test11", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test12", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test13", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test14", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test15", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test16", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test17", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test18", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test19", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test21", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test22", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test23", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test24", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test25", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test26", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test27", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test28", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test29", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test31", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test32", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test33", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test34", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test35", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test36", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test37", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test38", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test39", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test41", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test42", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test43", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test44", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test45", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test46", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test47", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test48", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test49", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE},
						  {"Test51", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE},				  				  
						  {"Test52", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE},
						  {"Test53", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE},
						  {"Test54", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE},
						  {"Test55", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE},
						  {"Test56", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE},
						  {"Test57", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE},
						  {"Test58", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE},
						  {"Test59", EspecialistaEnum.ORTOPEDISTA, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE}

						  


						  

										
						
					  };
					  
					 
					  
				  }
		   
		   FachadaHospital fachadaHospital = new FachadaHospital();
		   fachadaHospital.loadPacientes(fichaCliente);
		   fachadaHospital.loadMedicos();
		   
		  
	}
	
}
