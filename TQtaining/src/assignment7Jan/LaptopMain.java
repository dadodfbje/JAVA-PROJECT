package assignment7Jan;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop as=new Laptop();
        as.setNoOfUSBPort(4);
        as.setProcessorSpeed(3);
        System.out.println(as.getNoOfUSBPort());
        System.out.println(as.getProcessorSpeed());
	}

}
