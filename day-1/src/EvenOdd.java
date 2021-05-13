import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("PE an no");
		Scanner scanner=new Scanner(System.in);
		
		int no=scanner.nextInt();
		if(isEven(no)) 
			System.out.println("even no ");
		else
			System.out.println("odd no");
		
	}
	
	public static boolean isEven(int no) {
		return (no%2==0) ?true:false;	
	}
}




