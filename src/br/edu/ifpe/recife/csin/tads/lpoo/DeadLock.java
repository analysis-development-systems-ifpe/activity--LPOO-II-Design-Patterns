package br.edu.ifpe.recife.csin.tads.lpoo;

public class DeadLock {
	private DeadLock other;
	
	
	private void doSomething(){
		System.out.println("m1");
		Thread.yield();
	}
	
	public void setOther(DeadLock other){
		this.other = other;
	}
	
	
	public synchronized void m1(){
		doSomething();
		other.m2();
	}
	
	public synchronized void m2(){
		System.out.println("m2");
	}

}
