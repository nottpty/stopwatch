package stopwatch;

public class AppendStringBuilderTask implements Runnable{
	private int count;
	
	public AppendStringBuilderTask(int count){
		this.count = count;
	}
	
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		
	}
	
	public String toString(){
		return String.format("Append %,d chars to StringBuilder", count);
	}

}
