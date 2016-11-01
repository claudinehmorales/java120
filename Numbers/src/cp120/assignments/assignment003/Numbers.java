package cp120.assignments.assignment003;

import java.math.BigInteger;
import java.util.Arrays;


public class Numbers {

	public static boolean isPrime(int num){
		if (num < 0){
			throw new IllegalArgumentException("num should be greater than 0!");
		}
		else if (num == 0){
			return false;
		} else if (num == 1){
			return false;
		} else if (num == 2){
			return true;
		} else if (num == 3){
			return true;
		} else if (num % 2 == 0){
			return false;
		} else if (num % 3 == 0){
			return false;
		}
		
		int i = 5;
		int w = 2;
		
		while (i * i <= num){
			if (num % i == 0){
				return false;
			}
			i += w;
			w = 6 - w;
		}
		return true;
	}
	
	public static int lcm(int num1, int num2){
		int lcm = 0;
		if (num1 < 0 || num2 < 0){
			throw new IllegalArgumentException("Both integers must be greater than 0");
		} else if (num1 == 0 || num2 == 0){
			num1 = 0;
		} else {
		lcm = (num1 * num2) / gcf(num1, num2);
		}
		return lcm;
	}
	
	public static int gcf(int num1, int num2){	
		if (num1 < 0 || num2 < 0){
			throw new IllegalArgumentException("Both integers must be greater than 0");
		} else if (num1 == 0 || num2 == 0){
			num1 = 0;
		} else {
		while (num2 > 0){
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		}
		return num1;
	}
	
	public static int digitSum(int num){
		int digitSum = 0;
		if (num < 0){
			throw new IllegalArgumentException("num must be greater than 0");		
		} else {
			String digitString = new Integer(num).toString();
			for (char c: digitString.toCharArray()){
				digitSum += c - '0';
			}
		}
		return digitSum;
	}
	
	public static double mean(double[] arr){
		double mean = 0;
		double sum = 0;
		if (arr.length == 0){
			throw new IllegalArgumentException("array must not be empty");
		} else {
			for (int i = 0; i < arr.length; i++){
				sum += arr[i];
				mean = sum / arr.length;
			}
		}
		return mean;		
	}
	
	public static double median(double[] arr){
		double median = 0;
		if(arr.length == 0){
			throw new IllegalArgumentException("array must not be empty");
		} else if (arr.length % 2 == 0){
			Arrays.sort(arr);
			median = ((double) arr[arr.length/2] + (double) arr[arr.length/2 - 1]) / 2;
		} else {
			Arrays.sort(arr);
			median = ((double) arr[arr.length/2]);
		}
		return median;
	}
	
	public static BigInteger factorial(int num) {
	    BigInteger factorial = new BigInteger("1");
	    for (int i = 1; i <= num; i++) {
	        factorial = factorial.multiply(new BigInteger(i + ""));
	    }
	    return factorial;
	   }
		
	public static BigInteger factorial(BigInteger num) {
	    BigInteger result = BigInteger.ONE;
	    while (!num.equals(BigInteger.ZERO)) {
	        result = result.multiply(num);
	        num = num.subtract(BigInteger.ONE);
	    }
	    return result;
	}
}