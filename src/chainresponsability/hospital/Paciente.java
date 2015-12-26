package chainresponsability.hospital;


public class Paciente  {
	
    private static int nextId = 1;
	private int  id = nextId++;
	private String nomePaciente;
	private int prioridade;
	private int tempoAtendimento;
	private EstadoPacienteEnum estadoPaciente;
	private TipoPacienteEnum tipoPaciente;
	private EspecialistaMedicoEnum especialistaMedicoEnum;
	
	
	public Paciente( TipoPacienteEnum tipoPaciente,  EstadoPacienteEnum estadoPaciente, EspecialistaMedicoEnum especialistaMedicoEnum) {
		this.nomePaciente = tipoPaciente.toString() + "-" + estadoPaciente.toString() + "-" + especialistaMedicoEnum.toString();
		this.estadoPaciente = estadoPaciente;
		this.tipoPaciente = tipoPaciente;
		this.prioridade = (estadoPaciente.ordinal()+1) * (tipoPaciente.ordinal()+1);
		this.especialistaMedicoEnum = especialistaMedicoEnum;
		this.tempoAtendimento =0;
    }
	
	public EstadoPacienteEnum getEstadoPaciente() {
		return estadoPaciente;
	}

	public void setEstadoPaciente(EstadoPacienteEnum estadoPaciente) {
		this.estadoPaciente = estadoPaciente;
	}

	public TipoPacienteEnum getTipoPaciente() {
		return tipoPaciente;
	}

	public void setTipoPaciente(TipoPacienteEnum tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
    public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	

	public EspecialistaMedicoEnum getEspecialistaMedicoEnum() {
		return especialistaMedicoEnum;
	}

	public void setEspecialistaMedicoEnum(
			EspecialistaMedicoEnum especialistaMedicoEnum) {
		this.especialistaMedicoEnum = especialistaMedicoEnum;
	}
	
	

	public int getTempoAtendimento() {
		return tempoAtendimento;
	}

	public void setTempoAtendimento(int tempoAtendimento) {
		this.tempoAtendimento = tempoAtendimento;
	}

	public String toString(){
    	
    	return "ID: " + id + " # Paciente: " + this.getNomePaciente() + " # Priority: " + this.getPrioridade()  + " # Time: " + this.getTempoAtendimento() +"s";
    }
	
}
