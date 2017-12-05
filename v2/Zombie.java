/*
*  Zombie Class
*  - Used for monster game
*  - Sublcass of Monster
*/
public class Zombie extends Monster{
	
	public Medic () {
		super();
		health = 45;
		strength = 10;
		defense = 50;
		attackRating = .5;
	}

	public String toString () {
		return super.toString();
	}
}
