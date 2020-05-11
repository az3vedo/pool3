package pool3;
import java.util.Date;

public class Cash {
	private Date date;
	private String name;
	private Double amount;
	private String type; // there are 2 types, "outgoing" and "income"
	
	
	
	
public Cash(Date date, String id_name, String type, Double amount) {
		this.date = date;
		this.name = id_name;
		this.type = type;
		if (type == "outgoing") {
			this.amount = amount*(-1);
		}else {
			this.amount = amount;
		}
	}

// Methods
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String id_name) {
		this.name = id_name;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
