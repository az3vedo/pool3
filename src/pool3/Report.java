package pool3;

import java.time.LocalDate;

public class Report {
	private String period;
	private LocalDate startDate;
	private LocalDate endDate;
//	private HashMap<String, Float> entradas = new HashMap<String, Float>();
	
	public Report(String startDate, String endDate) {
		this.startDate = LocalDate.parse(startDate);
		this.endDate = LocalDate.parse(endDate);
		this.period = (startDate + " - " + endDate);
		
		
	}
	
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
