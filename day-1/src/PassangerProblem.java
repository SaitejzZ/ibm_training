
class Vehical{
	public void move(String s, String d) {
	}
}

class Bike extends Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s + " to "+ d +" using bike");
	}
}

class Metro extends Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s + " to "+ d +" using metro");
	}
}

class Car extends Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s + " to "+ d +" using car");
	}
}

//use a : passanger is using metro to travel from one palace to another
/*
 * what is the symptoms of bad code
 * if u chage at one plaece u code break at 10 place
 * 
 */

class Passanger  {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Vehical vehical) {
		System.out.println("passanger name: "+ name);
		vehical.move(s, d);
	}
	
}
public class PassangerProblem {

	public static void main(String[] args) {
		//Metro metro=new Metro();
		Vehical vehical =new Bike();
		Passanger passanger=new Passanger("raj");
		passanger.travel("BTM", "Lal bagh", vehical);
		
	}
}




