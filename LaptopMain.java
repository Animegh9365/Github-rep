
public class LaptopMain {

	public static void main(String[] args) {
		Laptop laptop = new Laptop("ASUS");
		laptop.displayLaptopDetials();
		
		//creating object of member inner class
		Laptop.Ram ram = laptop.new Ram(8);
		ram.displayRamSize();
		
		Laptop.HardDisk hdd = new Laptop.HardDisk(500);
		hdd.displayHardDiskDetails();
		
		laptop.processorDetails();
		
	}

}
