import java.util.Scanner;

public class CheckPrime {
	
	public static void main(String[] args) {
		System.out.println("PE an no");
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		
		
		boolean isPrime = checkPrimeNumber(no);
		
		print(isPrime);
		
	}



	static void print(boolean isPrime) {
		if(isPrime)
			System.out.println("no is a prime no");
		else
			System.out.println("no is not a prime no");
	}

	
	
	static boolean checkPrimeNumber(int no) {
		boolean isPrime=true;// pre assumption that no is a prime no
		
		for(int i=2; i<no; i++) {
			if(no%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}
