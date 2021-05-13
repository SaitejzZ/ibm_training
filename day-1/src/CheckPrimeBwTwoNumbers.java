import java.util.Scanner;

public class CheckPrimeBwTwoNumbers {

	public static void main(String[] args) {
		System.out.println("PE first no");
		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();
		System.out.println("PE sec no");
		int n2 = scanner.nextInt();

		if(n1<n2) {
			int sum=0;
			// finding the no of prime no bw two give no

			for (int i = n1; i <= n2; i++) {
				if(checkPrimeNumber(i)) {
					sum++;
				}
			}
			System.out.println("no of prime nos: "+ sum);

		}else {
			System.out.println("n1> n2");
		}
	}

	static void print(boolean isPrime) {
		if (isPrime)
			System.out.println("no is a prime no");
		else
			System.out.println("no is not a prime no");
	}

	static boolean checkPrimeNumber(int no) {
		boolean isPrime = true;// pre assumption that no is a prime no

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
