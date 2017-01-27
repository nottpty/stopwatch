package stopwatch;

public class Main {
	public static void main(String[] aergs){
		TaskTimer taskTimer = new TaskTimer();
		Runnable[] tasks = { new AppendStringBuilderTask(100000),
				new AppendStringTask(100000),
				new SumBigDecimalTask(1000000000),
				new SumDoublePrimitiveTask(1000000000),
				new SumDoubleTask(1000000000)
		};
		for(Runnable i: tasks){
			taskTimer.measureAndPrint(i);
		}
	}
}
