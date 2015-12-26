package chainresponsability.case03;

public class ChainDemo {
	  public static void main( String[] args ) {
		    PipeAndFilter filters =
		        new Minimum( new Total( new Average( null ) ) );
		    int[] input = { 10, 1, 9, 2, 8, 3, 7, 4, 6, 5 };
		    for (int i=0; i < input.length; i++)
		      filters.processNumber( input[i] );
		    filters.reportResults();
		} }
