package stopwatch;

public class Stopwatch {
	private boolean state;
	private static final double NANOSECONDS = 1.0E-9;
	private long startTime,stopTime;
	
	public double getElapsed(){
		if(state) return (double)((System.nanoTime()-startTime)*NANOSECONDS);
		return (double)((stopTime-startTime)*NANOSECONDS);
	}
	
	public boolean isRunning(){
		if(state) return true;
		return false;
	}
	
	public void start(){
		startTime = System.nanoTime();
		state = true;
	}
	
	public void stop(){
		stopTime = System.nanoTime();
		state = false;
	}
}
