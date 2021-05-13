import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		
		int marks[]= {89,89,67,90,99,56};
		
		
		Arrays.sort(marks);//it is a readymade method to sort the data
		for(int i=0;i< marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		
		
		
//		int marks[]= {89,89,67,90,99,56};
//		int noOfStudentPassExam=0;
//		
//		for(int i=0; i< marks.length; i++) {
//			if(marks[i]>=70)
//				noOfStudentPassExam++;
//		}
//		System.out.println(noOfStudentPassExam);
	}
}
