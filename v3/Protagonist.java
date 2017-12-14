/*
*  Protagonist Class
*  - Used for monster game
*  - Designed to work with @Monster class, and game user
*/

//Abstract Error: Protagonist.java:6: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
public abstract class Protagonist extends Character {

	//fields
	protected String name;

	/*
	*  Constructor
	*  - Sets name field to String @name_ parameter
	*  - @health, @strength, @defense, and @attackRating fields are initialized to default values
	*/
	public Protagonist (String name_) {
		name = name_;
		health = 100;
		strength = 15;
		defense = 10;
		attackRating = 1.0;
	}

	/*
	*  Instance Method
	*  - @return @name field of object
	*/
	public String getName () {
		return name;
	}

	/*
	*  Instance method
	*  - Prepares the @Protagonist object for a special attack
	*  - Modifes @defense and @attackRating fields appropriately
	*/
	public void specialize () {
		defense -= 5;
		attackRating *= 2;
	}

	/*
	*  Instance method
	*  - Normalizes the @Protagonist object
	*  - Modifes @defense and @attackRating fields back to their original values
	*/
	public void normalize () {
		defense += 5;
		attackRating *= .5;
	}

	public abstract String toString();
}
