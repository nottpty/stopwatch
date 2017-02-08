package stopwatch;

/**
 * Add Double objects from an array.
 * You need a large counter value to get a measurable time.
 * @author Patinya Yongyai
 *
 */
public class SumDoubleTask implements Runnable{
	// size of the array used in floating point tasks.
	// Don't make this too big to avoid slowing down test with paging
	// or possible out-of-memory error.
	static final int ARRAY_SIZE = 500000;
	private Double[] values;
	private int counter;
	
	/**
	 * Constructor for creating SumDoubleTask.
	 * @param counter the round of summation.
	 */
	public SumDoubleTask(int counter){
		values = new Double[ARRAY_SIZE];
		this.counter = counter;
	}
	
	/**
	 * Perform the task by summation of double from an array.
	 */
	@Override
	public void run() {
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}
	
	/**
	 * Return a descriptive name of the task.
	 */
	public String toString(){
		return String.format("Sum array of Double objects with count=%,d", counter);
	}

}
