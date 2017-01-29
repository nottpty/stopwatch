package stopwatch;

/**
 * Append chars to a StringBuilder.
 * @author Patinya Yongyai
 *
 */
public class AppendStringBuilderTask implements Runnable{
	private int count;
	
	/**
	 * Constructor for creating AppendStringBuilderTask.
	 * @param count the size of string that will append to StringBuilder.
	 */
	public AppendStringBuilderTask(int count){
		this.count = count;
	}
	
	/**
	 * Perform the task by append chars to a StringBuilder.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		
	}
	
	/**
	 * Return a descriptive name of the task.
	 */
	public String toString(){
		return String.format("Append %,d chars to StringBuilder", count);
	}

}
