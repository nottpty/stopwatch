package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Patinya Yongyai
 * @version 29.01.2017
 */
public class Stopwatch {
	/** State of the stopwatch */
	private boolean state;
	/** Constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** Time that the stopwatch was started and stopped, in nanoseconds. */
	private long startTime, stopTime;

	/**
	 * @return the elapsed time in seconds with decimal. There are 2 cases: (a)
	 *         If the stopwatch is running, then return the elapsed time since
	 *         start until the current time. (b) If stopwatch is stopped, then
	 *         return the time between the start and stop times.
	 */
	public double getElapsed() {
		if (state)
			return (System.nanoTime() - startTime) * NANOSECONDS;
		return (stopTime - startTime) * NANOSECONDS;
	}

	/**
	 * To check state of the stopwatch.
	 * 
	 * @return true if the stopwatch is running, false if stopwatch is stopped.
	 */
	public boolean isRunning() {
		return state;
	}

	/**
	 * Reset the stopwatch and start if if stopwatch is not running. If the
	 * stopwatch is already running then start does nothing.
	 */
	public void start() {
		if (!state)
			startTime = System.nanoTime();
		state = true;
	}

	/**
	 * Stop the stopwatch. If the stopwatch is already stopped, then stop does
	 * nothing.
	 */
	public void stop() {
		if (state)
			stopTime = System.nanoTime();
		state = false;
	}
}
