/*
*  DeathRobot Class
*  - Used for monster game
*  - Sublcass of Protagonist
*/
public class DeathRobot extends Protagonist{
	
	public DeathRobot (String name) {
		super(name);
		health = 200;
		strength = 25;
		defense = 20;
		attackRating = .5;
	}

	public String toString () {
		return super.toString();
	}
}
