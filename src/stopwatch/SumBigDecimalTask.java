package stopwatch;

import java.math.BigDecimal;

public class SumBigDecimalTask implements Runnable{
	static final int ARRAY_SIZE = 500000;
	private int counter;
	
	public SumBigDecimalTask(int counter){
		this.counter = counter;
	}
	
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
	
	public String toString(){
		return String.format("Sum array of BigDecimal with count=%,d", counter);
	}

}
