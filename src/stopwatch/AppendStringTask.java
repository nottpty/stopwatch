package stopwatch;

/**
 * Append chars to a String.
 * @author Patinya Yongyai
 *
 */
public class AppendStringTask implements Runnable{
	private int count;
	
	/**
	 * Constructor for creating AppendStringTask.
	 * @param count the size of string that will append to StringBuilder.
	 */
	public AppendStringTask(int count){
		this.count = count;
	}
	
	/**
	 * Perform the task by append chars to a string.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		String result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
	}
	
	/**
	 * Return a descriptive name of the task.
	 */
	public String toString(){
		return String.format("Append %,d chars to String", count);
	}

}
