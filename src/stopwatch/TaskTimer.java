package stopwatch;

public class TaskTimer {
	public static void measureAndPrint(Runnable runnable){
		Stopwatch timer = new Stopwatch();
		timer.start();
		runnable.run();
		System.out.println(runnable.toString());
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
