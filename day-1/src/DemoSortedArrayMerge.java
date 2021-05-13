
public class DemoSortedArrayMerge {

	public static void main(String[] args) {
		int arr1[]= {1,3,5,9,70};
		int arr2[]= {4,5,12,79};
		
	//	we need to write the program to merge them

		//int arrResult[]={1,3,4,5,5, 9,12, 70, 79};
		
		int arrResult[]=new int[arr1.length+ arr2.length];// result lenth=arr1 + arr2
		int i, j, k;
		k=0;
		for( i=0, j=0; i<arr1.length || j< arr2.length ;) {
			if(arr1[i]< arr2[j]) {
				arrResult[k++]=arr1[i++];
			}else {
				arrResult[k++]=arr2[j++];
			}
		}
		//finally if element left then add them at the end of arrResult
	}
}
