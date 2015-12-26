package br.edu.ifpe.recife.csin.tads.lpoo.lifetime;

public class RandomGenerator implements Runnable {

	@Override
	public void run() {
		int number;
		while (true) {
			number = (int) (Math.random() * 1000);
			System.out.println(number);
			if (Thread.currentThread().isInterrupted())
				break;
		}
	}

	public static void main(String[] args) {

		RandomGenerator randomGenerator = new RandomGenerator();
		Thread thread = new Thread(randomGenerator);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		thread.interrupt();
	}

}
