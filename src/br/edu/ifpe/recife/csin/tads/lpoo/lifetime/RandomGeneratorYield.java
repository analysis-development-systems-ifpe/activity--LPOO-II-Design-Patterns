package br.edu.ifpe.recife.csin.tads.lpoo.lifetime;

public class RandomGeneratorYield implements Runnable {

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.printf("%s = %d\n", Thread.currentThread().getName(), i);
			if (i % 3 == 0) {
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RandomGeneratorYield randomGenerator = new RandomGeneratorYield();
		Thread thread = new Thread(randomGenerator, "T1");
		thread.setPriority(Thread.MAX_PRIORITY);
		Thread thread1 = new Thread(randomGenerator, "T2");
		thread.start();
		thread1.start();
	}
}
