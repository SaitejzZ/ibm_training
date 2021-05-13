
public class Demo2 {

	public static void main(String[] args) {
		int a[][]=new int[5][5];
		int n=5;
		 for(int i=0;i<n;i++){
	            for(int j=0;j<=i;j++)
	                if(j==0 || j==i)
	                    a[i][j]=1;
	                else
	                    a[i][j]=a[i-1][j-1]+a[i-1][j];
	      }
		 
		for(int i=0;i<5; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
