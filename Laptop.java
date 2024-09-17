
public class Laptop {
	String brand;
	
	public Laptop(String brand) {
		this.brand = brand;
	}
	//Member inner class
	class Ram {
		int ramSize;
		
		public Ram(int ramSize) {
			this.ramSize = ramSize;
		}
		
		public void displayRamSize() {
			System.out.println("Size of the ram is: " + ramSize);
		}
	}
	
	//Static inner class
	public static class HardDisk {
		int hddSize;
		
		public HardDisk(int hddSize) {
			this.hddSize = hddSize;
		}
		
		public void displayHardDiskDetails() {
			System.out.println("Size of hard disk is: " + hddSize);
		}
		
	}
	
	//local inner class
	void processorDetails() {
		class Processor {
			String processor;
			public Processor(String processor) {
				this.processor = processor;
			}
			
			public void displayProcessorDetiails() {
				System.out.println("The processor is: " + processor);
			}
		}
		Processor processor = new Processor("i5");
		processor.displayProcessorDetiails();
	}
	
	void displayLaptopDetials() {
		System.out.println(brand);
	}
}

