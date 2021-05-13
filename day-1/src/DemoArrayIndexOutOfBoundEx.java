
class Dog{
	private String color;
	public Dog(String color) {
		this.color=color;
	}
	public void sound() {
		System.out.println("dog sound: "+ color);
	}
}
public class DemoArrayIndexOutOfBoundEx {
	
	public static void main(String[] args) {
		
		//how many dogs are there in this array
		Dog dogs[]=new Dog[4];
		dogs[0]=new Dog("black");
		dogs[1]=new Dog("light brown");
		dogs[2]=new Dog("white");
		dogs[2]=new Dog("light black");
		dogs[3]=new Dog("white");
		
		
		
		
		
		/*
		 * 1. 4
		 * 2. 3
		 * 3. 2
		 * 4. 0
		 */
		for(Dog dog: dogs) {
			dog.sound();
		}
		
		
//		
//		Dog d=new Dog();
//		
//		d=null;
//		
//		
//		
//		
//		d.sound();
		
		
		//NPEx: u have ref but no object attached with that and u calling the method
		
				  //0 1 2  3 
//		int arr[]= {4,6,7,10};
//		
//		//System.out.println(arr[4]);
//		for(int i=0;i<=arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}

}
