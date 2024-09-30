
public class Motherboard {
	private String component_type;
	private String manufactuer;
	private String model;
	private String CPU_socket_type;
	private int DIMMslots;
	private double manufactuerPrice;
	
	public Motherboard(String manufactuer, String model, String CPU_socket_type, int DIMMslots, double manufactuerPrice) {
		this.component_type = "Motherboard";
		this.manufactuer = manufactuer;
		this.model = model;
		this.CPU_socket_type = CPU_socket_type;
		this.DIMMslots = DIMMslots;
		this.manufactuerPrice = manufactuerPrice;
	}
	
	public String getmanufactuer() {
		return manufactuer;
	}
	
	public String getmodel() {
		return model;
	}
	
	public String getCPU_socket_type() {
		return CPU_socket_type;
	}
	
	public int getDIMMslots() {
		return DIMMslots;
	}
	
	public double getmanufactuerPrice() {
		return manufactuerPrice;
	}
	
	public String toString() {
		return "manufactuer= " + "'" + manufactuer + "'" + ' ' + 
						 ", model= " + "'" + model + "'" + ' ' + 
						 ", CPU Socket Type= " + "'" + CPU_socket_type + "'"  +
						 ", DIMMslots= " + DIMMslots +
						 ", manufactuerPrice= " + manufactuerPrice;
	}
}
