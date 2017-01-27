package stopwatch;

public class SumDoubleTask implements Runnable{
	static final int ARRAY_SIZE = 500000;
	private int counter;
	
	public SumDoubleTask(int counter){
		this.counter = counter;
	}
	
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}
	
	public String toString(){
		return String.format("Sum array of Double objects with count=%,d", counter);
	}

}
