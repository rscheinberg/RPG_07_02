public class UserOfRPGv2 {
	
	//test method
	
	//fail0
	//prediction: It will fail with javac as a type error immediately recognized by the compiler
	//result: "incompatible types: DeathRobot cannot be converted to Monster", uses "javac UserOfRPGv2.java"
	public static void main(String[] args) {
		Blob blob = new Blob();
		DeathRobot deathrobot = new DeathRobot("Deathrobot");
		Medic medic = new Medic("Medic");
		Shooter shooter = new Shooter("Shooter");
		Vampire vampire = new Vampire();
		Zombie zombie = new Zombie();
		//Character[] agents = {blob, deathrobot, medic, shooter, vampire, zombie};
		
		//for(Character character : agents) {
		//	System.out.println(character.toString());
		//}		
		//}
		
		//fail1
		//prediction: symbol not recognized
		//result: "error: cannot find symbol", using "javac UserOfRPGv2.java"
		Character[] agents = {blob, vampire, zombie};
		for(Character character : agents) {
			System.out.println(character.getName());
		}
		
}
		
}