public class Hangar{
	
	public static void main(String[] args){
		Boat oui = new Boat ("beau", 876);
		System.out.println(oui.doStuff());

		Car non = new Car ( "Moche" , 678);
		System.out.println(non.doStuff());
	}


}
