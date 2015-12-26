
package chainresponsability.hospital;

public class PipeThread implements Runnable {
	
	private Medico chainMedicos;
	private Paciente paciente;
	public PipeThread(Medico chainMedicos, Paciente paciente) {
		super();
		this.chainMedicos = chainMedicos;
		this.paciente = paciente;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		this.chainMedicos.atendePaciente(paciente);
	}
	
	
	
	

}
