package stopwatch;

/**
 * Compute and print the elapsed time for any task.
 * @author Patinya Yongyai
 *
 */
public class TaskTimer {
	
	/**
	 * Runs a task, measures and prints its running time to the console.
	 * @param runnable a task that we want to find the elapsed time.
	 */
	public static void measureAndPrint(Runnable runnable){
		Stopwatch timer = new Stopwatch();
		timer.start();
		runnable.run();
		timer.stop();
		System.out.println(runnable.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
