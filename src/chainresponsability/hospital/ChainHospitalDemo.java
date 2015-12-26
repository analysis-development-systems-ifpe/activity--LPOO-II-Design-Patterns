package chainresponsability.hospital;

import java.util.ArrayList;
import java.util.List;

public class ChainHospitalDemo {
	
	public static void main(String[] args) {
		List<Paciente> test = new ArrayList<Paciente>();
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CLINICO));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.NEUROLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.ORTOPEDISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.GINECOLOGISTA));








		




		
		
		/*test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.GESTANTE, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.IDOSO, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.URGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente( TipoPacienteEnum.NORMAL, EstadoPacienteEnum.NAOURGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
		test.add(new Paciente(TipoPacienteEnum.NORMAL, EstadoPacienteEnum.EMERGENTE, EspecialistaMedicoEnum.CARDIOLOGISTA));
*/
		Medico medicos = new Medico(); 
		medicos.add(new Neurologista());
		medicos.add(new Ginecologista());
		medicos.add(new Ortopedista());
		medicos.add(new Cardiologista());
		medicos.add(new Clinico());
		medicos.add(new Clinico());
		medicos.wrapAround(medicos);
		Thread pipelineThread = null;
	//	Thread[] pipelineThreads = new Thread[test.size()];
		//int i =0;
		for (Paciente paciente : test) {
	
			//medicos.atendePaciente(paciente);
			//medicos.getNext().setPaciente(paciente);
			
			pipelineThread = new Thread(new PipeThread(medicos, paciente));
//			pipelineThreads[i] = pipelineThread;
			pipelineThread.start();
			pipelineThread.setPriority(paciente.getPrioridade());
//			/medicos.start();
			//medicos.setPriority(paciente.getPrioridade());

			/*Thread  thread = new Thread(medicos);
			thread.start();*/
			//i++;
		}
	
	
		while(Thread.activeCount() > 1){
			
			if(Thread.activeCount() == 1){
			
			System.out.println("Numeros de Threads: " + Thread.activeCount());
			break;
			}
			
		}
			
			medicos.gerarListaPacienteAtendidos();
			
		
		
	}

}
