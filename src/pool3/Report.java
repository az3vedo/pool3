package pool3;

public class Report {
	private String period;
	
	public Report(String start, String end) {
		this.period = (start + "-" +end);
		
	}
	
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	
}
