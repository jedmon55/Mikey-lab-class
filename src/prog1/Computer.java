package prog1;

public class Computer {                     // no static therefore it's an object

    // Data fields that are "private" are encapsulated"
	private String manufacturer;
	private String processor;
	protected double ramSize;    // what does protected mean?
	private int diskSize;
	protected double processorSpeed;
	
	// Methods
	
	/* Initializes a Computer object with all properties specified.
	 * @param  man The computer manufacturer
	 * @param processor The processor type
	 * @param ram The RAM size
	 * @param disk The disk size
	 * @param procSpeed The processor speed
	 * 
	 */

 public Computer(String man, String processor, double ram,        // these are variables 
		 int disk, double procSpeed) {  // 
	 manufacturer = man;               // why do I need to assign private variables the value of the paramters
	 this.processor = processor;
	 ramSize = ram;
	 diskSize = disk;
	 processorSpeed = procSpeed;
 	}
 
 public double getRamSize() {
	 return ramSize;
 }
 
 public double getProcessorSpeed() {
	 return processorSpeed;
 }
 
 public int getDiskSize() {
	 return diskSize;
 }
 
 public String toString() {
	 String result = "Manufacturer: " + manufacturer + "\nCPU: "
			 + processor + "\nRAM: " + ramSize + " gigabytes"
			 + "\nDisk: " + diskSize + " gigabytes"
			 + "\nProcessorspeed: " + processorSpeed + " gigahertz";
	 
	 return result;
 }
/*
 * Evaluate the power of this computer for purposes of installing or running software
 * @return the power
 * 
 */
public double computePower() {
	return ramSize * processorSpeed;
	}
}
	
