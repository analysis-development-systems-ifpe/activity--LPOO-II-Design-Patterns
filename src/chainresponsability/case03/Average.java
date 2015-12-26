package chainresponsability.case03;

public class Average extends PipeAndFilter {
	  private int total = 0, count = 0;
	  public Average( PipeAndFilter n ) { super( n ); }
	  public void processNumber( int in ) {
	    total += in;
	    count++;
	    super.processNumber( in );
	  }
	  public void reportResults() {
	    System.out.println( "average is " + ((double) total / count) );
	    super.reportResults();
	} }