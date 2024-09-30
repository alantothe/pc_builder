import java.util.ArrayList;

public class PC {
	private ArrayList<CPU> cpu;
	private ArrayList<GPU> gpu;
	private ArrayList<DIMM> dimm;
	private ArrayList<SSD> ssd;
	private ArrayList<Motherboard> motherboard;
	private ArrayList<PowerSupply> powersupply;
	
	public PC(ArrayList<CPU> Cpu, ArrayList<GPU> Gpu, ArrayList<DIMM> Dimm, ArrayList<SSD> Ssd, ArrayList<Motherboard> Motherboard, ArrayList<PowerSupply> Powersupply) {
		this.cpu = Cpu;
		this.gpu = Gpu;
		this.dimm = Dimm;
		this.ssd = Ssd;
		this.motherboard = Motherboard;
		this.powersupply = Powersupply;
	}
	
	public void addCPU(CPU Cpu) {
		cpu.add(Cpu);
	}
	
	public void addGPU(GPU Gpu) {
		gpu.add(Gpu);
	}

	public void addDIMM(DIMM Dimm) {
		dimm.add(Dimm);
	}

	public void addSSD(SSD Ssd) {
		ssd.add(Ssd);
	}

	public void addMotherboard(Motherboard Motherboard) {
		motherboard.add(Motherboard);
	}

	public void addPowerSupply(PowerSupply Powersupply) {
		powersupply.add(Powersupply);
	}
	
	public void displayResult() {
		System.out.println("PC Specification: ");
		System.out.println("CPU: " + cpu);
		System.out.println("GPU: " + gpu);
		System.out.println("DIMM: " + dimm);
		System.out.println("SSD: " + ssd);
		System.out.println("Motherboard: "+ motherboard);
		System.out.println("Power Supply: " + powersupply);
	}
}
