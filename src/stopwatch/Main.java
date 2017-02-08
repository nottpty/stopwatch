package stopwatch;

/**
 * A main class to create objects and run the program.
 * @author Patinya Yongyai
 *
 */
public class Main {
	/**
	 * Creates the tasks and pass each task to the TaskTimer.
	 * @param args not used
	 */
	public static void main(String[] args){
		TaskTimer taskTimer = new TaskTimer();
		Runnable[] tasks = { new AppendStringTask(50000),
				new AppendStringTask(100000),
				new AppendStringBuilderTask(100000),
				new SumBigDecimalTask(1000000000),
				new SumDoublePrimitiveTask(1000000000),
				new SumDoubleTask(1000000000)
		};
		for(Runnable i: tasks){
			taskTimer.measureAndPrint(i);
		}
	}
}
