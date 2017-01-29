package stopwatch;

/**
 * Add double primitives from an array.
 * You need a large counter value to get a measurable time.
 * @author Patinya Yongyai
 *
 */
public class SumDoublePrimitiveTask implements Runnable{
	// size of the array used in floating point tasks.
	// Don't make this too big to avoid slowing down test with paging
	// or possible out-of-memory error.
	static final int ARRAY_SIZE = 500000;
	private int counter;
	
	/**
	 * Constructor for creating SumDoublePrimitiveTask.
	 * @param counter the round of summation.
	 */
	public SumDoublePrimitiveTask(int counter){
		this.counter = counter;
	}
	
	/**
	 * Perform the task by summation of double primitives from an array.
	 */
	@Override
	public void run() {
		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;
		double sum = 0.0;
		// count = loop counter, i = array index value
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
	}
	
	/**
	 * Return a descriptive name of the task.
	 */
	public String toString(){
		return String.format("Sum array of double primitives with count=%,d", counter);
	}

}
