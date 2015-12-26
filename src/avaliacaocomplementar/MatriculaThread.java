package avaliacaocomplementar;

public class MatriculaThread extends Thread{
	
	private int digitoMatricula;

	public MatriculaThread(int digitoMatricula) {
		super();
		this.digitoMatricula = digitoMatricula;
		//setPriority( digitoMatricula);
		//System.out.println(getState().toString());
		System.out.println(this.getState().toString());

	 setPriority(digitoMatricula);
	}
	
	public void run(){
		try{
	//		
			Thread.sleep(50);
		//	System.out.println(getState().toString());
		}catch(InterruptedException e){
			
		}
		System.out.println(this.getState().toString());
		System.out.println(digitoMatricula);
		
	}
	
	
	public static void main(String[] args) {
		String[] digitoMatriculaString = {"9","1","3","4","5","6","10"};
		for (int i = 0; i < digitoMatriculaString.length; i++) {
		new  MatriculaThread(Integer.parseInt(digitoMatriculaString[i])).start();;
			//System.out.println(test.getState().toString());

		}
		
		
	}
	
}
