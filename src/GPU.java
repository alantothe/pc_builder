
public class GPU {
	private String component_type;
	private String manufactuer;
	private int amountVRAM;
	private boolean CUDAsupport;
	private double manufactuerPrice; 
	
	
	public GPU(String manufactuer, int amountVRAM, boolean CUDAsupport, double manufactuerPrice) {
		this.component_type = "GPU";
		this.manufactuer = manufactuer;
		this.amountVRAM = amountVRAM;
		this.CUDAsupport = CUDAsupport;
		this.manufactuerPrice = manufactuerPrice;
	}
	
	public String getmanufactuer() {
		return manufactuer;
	}
	
	public int getamountVRAM() {
		return amountVRAM;
	}
	
	public boolean getCUDAsupport() {
		return CUDAsupport;
	}

	public double getmanufactuerPrice() {
		return manufactuerPrice;
	}
	
	public String toString() {
		return "manufactuer= " + "'" + manufactuer + "'" + ' ' + 
						 ", amountVRAM= " + amountVRAM + 
						 ", CUDAsupport= " + "'" + CUDAsupport + "'"  +
						 ", manufactuerPrice= " + manufactuerPrice;
	}
}
