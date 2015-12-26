package chainresponsability.case03;

public class Minimum extends PipeAndFilter {
	private int min = 999;

	public Minimum(PipeAndFilter n) {
		super(n);
	}

	public void processNumber(int in) {
		if (in < min)
			min = in;
		super.processNumber(in);
	}

	public void reportResults() {
		System.out.println("minimum is " + min);
		super.reportResults();
	}
}
