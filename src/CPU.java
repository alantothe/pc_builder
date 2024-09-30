
public class CPU {
	private String component_type;
	private String manufactuer;
	private String model;
	private int clock_rate;
	private boolean overClocking;
	private String socket_type;
	private double manufactuerPrice;
	
	public CPU(String manufactuer, String model, int clock_rate, boolean overClocking, String socket_type, double manufactuerPrice) {
		this.component_type = "CPU";
		this.manufactuer = manufactuer;
		this.model = model;
		this.clock_rate = clock_rate;
		this.overClocking = overClocking;
		this.socket_type = socket_type;
		this.manufactuerPrice = manufactuerPrice;
	}
	
	public String getcomponent_type() {
		return component_type;
	}
	
	public String getmanufactuer() {
		return manufactuer;
	}
	
	public String model() {
		return model;
	}
	
	public int getclock_rate() {
		return clock_rate;
	}
	
	public boolean getoverClocking() {
		return overClocking;
	}
	
	public String getsocket_type() {
		return socket_type;
	}
	
	public double getmanufactuerPrice() {
		return manufactuerPrice;
	}
	
	public String toString() {
		return "manufactuer= " + "'" + manufactuer + "'" + ' ' + 
						 ", model= " + "'" + model + "'" + ' ' + 
						 ", clockRate= " + clock_rate  +
						 ", overclocking= " + "'" + overClocking + "'" +
						 ", socketType= " + "'" + socket_type + "'" + ' ' +
						 ", manufactuerPrice= " + manufactuerPrice;
	}
}	