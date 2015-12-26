package avaliacaocomplementar;

import java.awt.datatransfer.ClipboardOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ClienteControl extends Thread{
	private Cliente cliente;

	public ClienteControl(Cliente c) {
		this.cliente = c;
	}
	static Cliente[] clienteArray;
	  static {
		  clienteArray= new Cliente[] {
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	        new  Cliente("test1", 1999),
	        new  Cliente("test2", 1991),
	        new Cliente("test3", 1995),
	        new Cliente("test4", 1997),
	        new  Cliente("test5", 2000),
	        new  Cliente("test6", 1992),
	        new Cliente("test7", 1994),
	        new Cliente("test8", 1996),
	        new Cliente("test9", 1998),
	    };
	  }
	
	public void run(){
		go();
		System.out.println("STATE IN RUN  METHOD = "+this.getState().toString());
	}
	
	public void go(){
		try {
		
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		doMore();
	}
	public void doMore(){
		System.out.println(cliente);

	}
	
	public static void main(String[] args) {
		List<ClienteControl> threads = new Vector<ClienteControl>();
		List<Cliente> clientes = Arrays.asList(clienteArray);
		for(Cliente c :clientes){
			ClienteControl t = new ClienteControl(c);
			System.out.println("AFTER NEW = "+t.getState().toString());
			//System.out.println(c.getAnoNasc()%10 +1);
			
			t.setPriority(c.getAnoNasc()%10+1);
			threads.add( t);
		}
		
		for(ClienteControl t : threads){
			t.run();
			System.out.println("AFTER CALL RUN = " + t.getState().toString());
			//t.start();
		}
	}
	
	
	
}
