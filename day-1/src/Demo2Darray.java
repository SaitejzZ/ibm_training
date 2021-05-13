
public class Demo2Darray {
	public static void main(String[] args) {
		
		int x[][]= {{1,0,0},{0,1,0},{0,0,1}};
		
		for(int temp[]:x) {
			for(int temp2: temp) {
				System.out.print(temp2+" ");
			}
			System.out.println();
		}
		
		//to check whether matix is identity matrix or not 
		
		boolean isIdentityMatrix= checkIsItIdentityMatrix(x);
		System.out.println(isIdentityMatrix);
		//how to print the array 
		
		//int x[]= {5,7,8,9};
	
		//java 5: enhace for loop to print the array
		
//		for(int temp: x) {
//			System.out.println(temp);
//		}
		
		
		//older sy if u want to print the array 
//		for(int i=0;i<=x.length ; i++) {
//			System.out.println(x[i]);
//		}
		
		
		
		//int a[][]=new int[5][4];
		
		

	}

	private static boolean checkIsItIdentityMatrix(int[][] x) {
		boolean isIdentity=true;
		for(int i=0; i< x.length; i++) {
			for(int j=0;j< x[i].length; j++) {
				if(i==j) {
					if(x[i][j]!=1) {
						isIdentity=false;
						break;
					}
				}
			    if(i!=j) {
			    	if(x[i][j]!=0) {
						isIdentity=false;
						break;
					}
			    }
			}
		}
		return isIdentity;
	}
}


