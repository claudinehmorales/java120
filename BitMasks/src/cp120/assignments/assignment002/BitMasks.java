package cp120.assignments.assignment002;

public class BitMasks {

	public static void main(String[] args) {
		int[] registerArray = new int[4];
		registerArray[0] = 0b0110100100011001;
		registerArray[1] = 0b0010101100011101;
		registerArray[2] = 0b0110110100011001;
		registerArray[3] = 0b0110111100011101;
		int originMask   = 0b0000000000000111;
		int securityMask = 0b0000000000011000;
		int dataMask     = 0b0000000111100000;
		int countMask 	 = 0b0000011000000000;
		int startMask    = 0b0000100000000000;
		int controlMask  = 0b1111000000000000; 
		
		for(int i = 0; i <= registerArray.length - 1; i++){
			int originField = registerArray[i] & originMask;
			int securityField = registerArray[i] & securityMask;
			int dataField = registerArray[i] & dataMask;
			int countField = registerArray[i] & countMask;
			int startField = registerArray[i] & startMask;
			int controlField = registerArray[i] & controlMask;
			System.out.println(Integer.toBinaryString(registerArray[i]));
			int origin = originField >> 0;
			int security = securityField >> 3;
			int data = dataField >> 5;
			int counter = countField >> 9;
			int start = startField >> 11;
			int control = controlField >> 12;
			System.out.println("origin = " + origin);
			System.out.println("sec = " + security);
			System.out.println("data = " + data);
			System.out.println("count = " + counter);
			System.out.println("start = " + start);
			System.out.println("ctrl = " + control + "\n");
		}
	}
}
	

