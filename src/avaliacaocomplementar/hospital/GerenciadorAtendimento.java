package avaliacaocomplementar.hospital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import avaliacaocomplementar.Cliente;
import avaliacaocomplementar.hospital.areamedica.EspecialistaEnum;
import avaliacaocomplementar.hospital.areamedica.Medico;
import avaliacaocomplementar.hospital.areamedica.nucleo.EspecialistaFactory;
import avaliacaocomplementar.hospital.areamedica.nucleo.NucleoCardiologista;
import avaliacaocomplementar.hospital.areapaciente.EstadoPacienteEnum;
import avaliacaocomplementar.hospital.areapaciente.Paciente;
import avaliacaocomplementar.hospital.areapaciente.TipoPacienteEnum;

public class GerenciadorAtendimento {
	
	
	    private boolean disponivel;
	    private String conteudo;
	    private Paciente paciente;
	    private int tempPriority =1;
	    private int contThreads =0;
	 
	    public synchronized void set(Paciente idPaciente) {
	        while (disponivel == true) {
	            try {
	            	
	                wait();
	               
	               
	            } catch (Exception e) {
	                e.printStackTrace();
	                
	            }
	        }
	      
	     
	      if(tempPriority <= idPaciente.getPriority()){
	        paciente = idPaciente;
	        System.out.println(idPaciente.toString()+ " entrou na sala! ");
	        
	        disponivel = true;
	        notifyAll();
	        tempPriority = idPaciente.getPriority();
	        }else{
	        	new Thread(idPaciente).start();
	        }
	      	contThreads++;
	      	if (Thread.activeCount() == contThreads){
	      		contThreads =0 ;
	      		tempPriority = 0;
	      	}
	      	
	    }
	 
	    public synchronized void  get(Medico medico) {
	        while (disponivel == false) {
	            try {
	            	System.out.println(medico.toString() 
	                        + " aguardando proximo o paciente...");
	                wait();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        
	        System.out.println(medico.toString() + " atendendo" + paciente.toString());
        
            
            System.out.println(medico.toString() + " finalizou a consulta...");
            System.out.println(paciente.toString() + " #"  + " saiu da sala...");
	        System.out.println(medico.toString() + " disponivel p/ atendimento!" );
	        
	        
	        disponivel = false;
	        notifyAll();
	  
	    }
	
	
	    static Object[][]  fichaCliente;
		  static {
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
				  {"Test59", EspecialistaEnum.CLINICO, TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE}
								
				
			  };
			  
		  }
	
	
		
	
	public static void main(String[] args) {
		
	   // System.out.println(Runtime.getRuntime().availableProcessors());

		List<Thread> listThread = new ArrayList<Thread>();
	
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
		
		/*for (Thread p : listThread){
			p.start();
		}*/
		
		
		Medico medicoClinicoA = new NucleoCardiologista().escalarEspecialista(1,GerenciadorAtendimentoFactory.getFilaEspecialista(EspecialistaEnum.CLINICO), 3);
		Medico medicoClinicoB = new NucleoCardiologista().escalarEspecialista(2,GerenciadorAtendimentoFactory.getFilaEspecialista(EspecialistaEnum.CLINICO), 9);

		
		medicoClinicoA.start();
		medicoClinicoB.start();
		
		
	
	}
	
}
