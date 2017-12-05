/*
*  Shooter Class
*  - Used for monster game
*  - Sublcass of Protagonist
*/
public class Shooter extends Protagonist{
	
	public Medic (String name) {
		super(name);
		health = 50;
		strength = 5;
		defense = 20;
		attackRating = 5.0;
	}

	public String toString () {
		return super.toString();
	}
}
