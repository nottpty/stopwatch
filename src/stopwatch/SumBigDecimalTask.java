package stopwatch;

import java.math.BigDecimal;

/**
 * Add BigDecimal objects from an array.
 * You need a large counter value to get a measurable time.
 * @author Patinya Yongyai
 *
 */
public class SumBigDecimalTask implements Runnable{
	// size of the array used in floating point tasks.
	// Don't make this too big to avoid slowing down test with paging
	// or possible out-of-memory error.
	static final int ARRAY_SIZE = 500000;
	private int counter;
	
	/**
	 * Constructor for creating SumBigDecimalTask.
	 * @param counter the round of summation.
	 */
	public SumBigDecimalTask(int counter){
		this.counter = counter;
	}
	
	/**
	 * Perform the task by summation of BigDecimals from an array.
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
		BigDecimal sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
	}
	
	/**
	 * Return a descriptive name of the task.
	 */
	public String toString(){
		return String.format("Sum array of BigDecimal with count=%,d", counter);
	}

}
