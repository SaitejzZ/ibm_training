
public class MatrixOperation {
	public static void main(String[] args) {
		
		int x[][]= {{1,0,0},{0,1,0},{0,0,1}};
		int y[][]= {{1,0,0},{0,1,0},{0,0,1}};
		
		int z[][]=sum(x, y);
		
		
		printArr(x);
		
		
	}
	
	static int[][] sum(int x[][],int y[][]){
		//if x and y are comptable to each other !
		 int[][] sumVal=new int[x.length][x[0].length];
		
		return null;
	}
	
	static int[][] mul(int x[][],int y[][]){
		//if x and y are comptable to each other !
		 int[][] sumVal=new int[x.length][x[0].length];
		
		return null;
	}

	static void printArr(int[][] x) {
		for(int temp[]:x) {
			for(int temp2: temp) {
				System.out.print(temp2+" ");
			}
			System.out.println();
		}
	}

	
}


