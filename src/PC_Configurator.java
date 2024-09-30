import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class PC_Configurator {

	public static void main(String[] args) throws FileNotFoundException {
		PC myPC = new PC (new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
				
		ArrayList<CPU> cpu = readCPUFile("CPU.txt");
		ArrayList<DIMM> dimm = readDIMMFile("DIMM.txt");
		ArrayList<GPU> gpu = readGPUFile("GPU.txt");
		ArrayList<SSD> ssd = readSSDFile("SSD.txt");
		ArrayList<Motherboard> motherboard = readMotherboardFile("Motherboard.txt");
		ArrayList<PowerSupply> powersupply = readPowerSupplyFile("PowerSupply.txt");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, would you like to build a PC? (y/n) ");
	
		System.out.println("input: ");
		String answer = input.nextLine().toLowerCase();
		double totalPrice = 0.0;
		if(answer.equals("y") || answer.equals("yes")){
			System.out.println("OK! Let get started! Which CPU would you like to add?");
			
			for (int i = 0; i < cpu.size(); i++) {
                CPU test = cpu.get(i);
                System.out.println((i + 1) + ": " + test); 
            }
			
            int answerCpu = input.nextInt();
            CPU selectedCPU = cpu.get(answerCpu - 1);
            totalPrice += selectedCPU.getmanufactuerPrice();
            //System.out.println(selectedCPU);
			myPC.addCPU(selectedCPU);
			//
			System.out.println("GREAT! Which GPU would you like to add?");
			for (int i = 0; i < gpu.size(); i++) {
                GPU test = gpu.get(i);
                System.out.println((i + 1) + ": " + test); 
            }
			int answerGpu = input.nextInt();
			GPU selectedGPU = gpu.get(answerGpu-1);
			totalPrice += selectedGPU.getmanufactuerPrice();
			myPC.addGPU(selectedGPU);
			//
			System.out.println("GREAT! Which DIMM would you like to add?");
			for (int i = 0; i < dimm.size(); i++) {
                DIMM test = dimm.get(i);
                System.out.println((i + 1) + ": " + test); 
            }
			int answerdimm = input.nextInt();
			DIMM selectedDIMM = dimm.get(answerdimm-1);
			totalPrice += selectedDIMM.getmanufactuerPrice();
			myPC.addDIMM(selectedDIMM);
			//
			System.out.println("GREAT! Which SSD would you like to add?");
			for (int i = 0; i < ssd.size(); i++) {
                SSD test = ssd.get(i);
                System.out.println((i + 1) + ": " + test); 
            }
			int answerssd = input.nextInt();
			SSD selectedSSD = ssd.get(answerssd-1);
			totalPrice += selectedSSD.getmanufactuerPrice();
			myPC.addSSD(selectedSSD);
			//
			System.out.println("GREAT! Which Motherboard would you like to add?");
			for (int i = 0; i < motherboard.size(); i++) {
                Motherboard test = motherboard.get(i);
                System.out.println((i + 1) + ": " + test); 
            }
			int answermotherboard = input.nextInt();
			Motherboard selectedMotherboard = motherboard.get(answermotherboard-1);
			totalPrice += selectedMotherboard.getmanufactuerPrice();
			myPC.addMotherboard(selectedMotherboard);
			//
			System.out.println("GREAT! Which Power Supply would you like to add?");
			for (int i = 0; i < powersupply.size(); i++) {
                PowerSupply test = powersupply.get(i);
                System.out.println((i + 1) + ": " + test); 
            }
			int answerpowersupply = input.nextInt();
			PowerSupply selectedPowersupply = powersupply.get(answerpowersupply-1);
			totalPrice += selectedPowersupply.getmanufactuerPrice();
			myPC.addPowerSupply(selectedPowersupply);
			myPC.displayResult();
			System.out.println("Total Price is: $" + totalPrice);
			//
		} else if(answer.equals("n") || answer.equals("no")) { 
			System.out.println("Thank you come again!");
			input.close();
			}else {
			System.out.println("Invaild answer.");
			}
			input.close();
    }
	

	
	public static ArrayList<CPU> readCPUFile(String cpufile) throws FileNotFoundException {
		ArrayList<CPU> cpu = new ArrayList<>();
		Scanner input = new Scanner(new File(cpufile));
		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    
		    String[] data = line.split(", ");
		    String manufactuer = data[0];
		    String model = data[1];
		    int clock_rate = Integer.parseInt(data[2]);
		    Boolean overClocking = Boolean.parseBoolean(data[3]);
		    String socket_type = data[4];
		    double manufactuerPrice = Double.parseDouble(data[5]);
		    
		    CPU cpuList = new CPU(manufactuer, model, clock_rate, overClocking, socket_type, manufactuerPrice);
		    cpu.add(cpuList);
		}
		return cpu;
	}
	
	public static ArrayList<DIMM> readDIMMFile(String dimmfile) throws FileNotFoundException {
		ArrayList<DIMM> dimm = new ArrayList<>();
		Scanner input = new Scanner(new File(dimmfile));
		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    
		    String[] data = line.split(", ");
		    String manufactuer = data[0];
		    int clock_rate = Integer.parseInt(data[1]);
		    int capacity = Integer.parseInt(data[2]);
		    double manufactuerPrice = Double.parseDouble(data[3]);
		    
		    DIMM dimmList = new DIMM(manufactuer, clock_rate, capacity, manufactuerPrice);
		    dimm.add(dimmList);
		}
//		for (DIMM test : dimm) {
//			System.out.println(test);
//		}
		return dimm;
	}
	
	public static ArrayList<GPU> readGPUFile(String gpufile) throws FileNotFoundException {
		ArrayList<GPU> gpu = new ArrayList<>();
		Scanner input = new Scanner(new File(gpufile));
		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    
		    String[] data = line.split(", ");
		    String manufactuer = data[0];
		    int amountVRAM = Integer.parseInt(data[1]);
		    boolean CUDAsupport = Boolean.parseBoolean(data[2]);
		    double manufactuerPrice = Double.parseDouble(data[3]);
		    
		    GPU cpuList = new GPU(manufactuer, amountVRAM, CUDAsupport, manufactuerPrice);
		    gpu.add(cpuList);
		}
//		for (GPU test : gpu) {
//			System.out.println(test);
//		}
		return gpu;
	}

	public static ArrayList<SSD> readSSDFile(String ssdfile) throws FileNotFoundException {
		ArrayList<SSD> ssd = new ArrayList<>();
		Scanner input = new Scanner(new File(ssdfile));
		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    
		    String[] data = line.split(", ");
		    String manufactuer = data[0];
		    int capacity = Integer.parseInt(data[1]);
		    double manufactuerPrice = Double.parseDouble(data[2]);
		    
		    SSD ssdList = new SSD(manufactuer, capacity, manufactuerPrice);
		    ssd.add(ssdList);
		}
//		for (SSD test : ssd) {
//			System.out.println(test);
//		}
		return ssd;
	}
	
	public static ArrayList<Motherboard> readMotherboardFile(String motherboardfile) throws FileNotFoundException {
		ArrayList<Motherboard> motherboard = new ArrayList<>();
		Scanner input = new Scanner(new File(motherboardfile));
		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    
		    String[] data = line.split(", ");
		    String manufactuer = data[0];
		    String model = data[1];
		    String CPU_socket_type = data[2];
		    int DIMMslots = Integer.parseInt(data[3]);
		    double manufactuerPrice = Double.parseDouble(data[4]);
		    
		    Motherboard motherboardList = new Motherboard(manufactuer, model, CPU_socket_type, DIMMslots, manufactuerPrice);
		    motherboard.add(motherboardList);
		}
//		for (Motherboard test : motherboard) {
//			System.out.println(test);
//		}
		return motherboard;
	}
	
	public static ArrayList<PowerSupply> readPowerSupplyFile(String powersupplyfile) throws FileNotFoundException {
		ArrayList<PowerSupply> powersupply = new ArrayList<>();
		Scanner input = new Scanner(new File(powersupplyfile));
		while (input.hasNextLine()) {
		    String line = input.nextLine();
		    
		    String[] data = line.split(", ");
		    String manufactuer = data[0];
		    String model = data[1];
		    int powerRating = Integer.parseInt(data[2]);
		    double manufactuerPrice = Double.parseDouble(data[3]);
		    
		    PowerSupply powersupplyList = new PowerSupply(manufactuer, model, powerRating, manufactuerPrice);
		    powersupply.add(powersupplyList);
		}
//		for (PowerSupply test : powersupply) {
//			System.out.println(test);
//		}
		return powersupply;
	}
}
