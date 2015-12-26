package chainresponsability.case03;

public abstract class PipeAndFilter  {
	  private PipeAndFilter next;
	  public PipeAndFilter( PipeAndFilter n ) { next = n; }
	  public void processNumber( int in ) {
	    if (next != null) next.processNumber( in );
	  }
	  public void reportResults() {
	    if (next != null) next.reportResults();
	} }
