package stopwatch;

public class AppendStringTask implements Runnable{
	private int count;
	
	public AppendStringTask(int count){
		this.count = count;
	}
	
	@Override
	public void run() {
		final char CHAR = 'a';
		String result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
	}
	
	public String toString(){
		return String.format("Append %,d chars to String", count);
	}

}
