package chainresponsability.hospital;

import java.util.ArrayList;
import java.util.List;


public   class Medico  {

	private Medico next;
	private int contEspecialista;

	
	
	
	
	public Medico getNext() {
		return next;
	}

	public Medico() {
		contEspecialista =0;
	}
	
	public void add(Medico m){
		contEspecialista++;
		 if (next != null) next.add( m );
	      else next = m;
	}
	
	  public void wrapAround( Medico firstP) {
	      if (next != null) next.wrapAround( firstP );
	      else next = firstP;
	   }
	

	
	public  void atendePaciente( Paciente paciente){
		
		if(next != null) next.atendePaciente( paciente);		
	}
	
	public   void gerarListaPacienteAtendidos(){
		if(contEspecialista >0 ){contEspecialista--;	
		if(next != null) next.gerarListaPacienteAtendidos();
		}
	}


	
	
	
	

}
