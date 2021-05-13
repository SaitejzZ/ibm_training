import java.util.Scanner;

public class Adder {
	
	public static void main(String[] args) {
		//adding 2 no
		int x, y,z;
		
		//Scanner class in java,					 BufferedReader ioXXXX
		Scanner scanner=new Scanner(System.in);
		System.out.println("please give first no");
		x=scanner.nextInt();
		
		System.out.println("please give sec no");
		y=scanner.nextInt();
		
		z=getSum(x,y);
		
		System.out.println(z);
	}
	
	public static  int getSum(int x ,int y) {
		return x+y;
	}

}
