package chainresponsability.case03;

public class Total extends PipeAndFilter {
	  private int total = 0;
	  public Total( PipeAndFilter n ) { super( n ); }
	  public void processNumber( int in ) {
	    total += in;
	    super.processNumber( in );
	  }
	  public void reportResults() {
	    System.out.println( "total is " + total );
	    super.reportResults();
	} }