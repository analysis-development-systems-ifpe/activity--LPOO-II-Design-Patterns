package chainresponsability.hospital;

import java.util.ArrayList;
import java.util.List;


public class Neurologista extends Medico {
	
	private  java.util.Random rn = new java.util.Random();
	private static int nextId = 1;
	private int id;
	private volatile List<Paciente> listPaciente;
	private volatile boolean ocupado;

	public Neurologista() {
		
		super();
		id = nextId++;
		this.listPaciente = new ArrayList<Paciente>();

		// TODO Auto-generated constructor stub
	}

	
	public  void atendePaciente( Paciente paciente){
		if(paciente.getEspecialistaMedicoEnum().equals(EspecialistaMedicoEnum.NEUROLOGISTA) && this.ocupado == false){
			  synchronized(this){
				System.out.println(this.toString() + " ATENDENDO " + paciente.toString());
			
			this.ocupado= true;
			int ms =((rn.nextInt(9) +1) * 100000)/1000;
			paciente.setTempoAtendimento(ms);	
			this.listPaciente.add(paciente);
			
			for (int i = 0; i < 100000; i++) {
				//System.out.println(this.toString() + " ATENDENDO " + paciente.toString());
			}notifyAll();
			
			this.ocupado =false;
			 }
			
		}else{
			if(this.ocupado){
				System.out.println(this.toString() + " OCUPADO!!! ");
			}
			super.atendePaciente(paciente);
		}
		

				System.out.println(this.toString() + " DISPONIVEL");
		
		
		
			
		
	}
	

	
	public  void gerarListaPacienteAtendidos(){
		 
		if(this.listPaciente.size() > 0){

			System.out.println(" * LISTA PACIENTES ATENDIDOS * "+ this.toString() );
			for (Paciente paciente : 	this.listPaciente) {
				System.out.println(paciente.toString());
			}
		 
		}
			super.gerarListaPacienteAtendidos();
	
	
	}
	
	
	
	

	 public String toString(){
			return "ID = "+ this.id + "Especialidade = " + EspecialistaMedicoEnum.NEUROLOGISTA;
		}
		


}
