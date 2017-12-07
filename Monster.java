public class Monster extends Character {

	public Monster() {
        	health = 150;
        	strength = (int) (Math.random()*45 + 20);
        	defense = 20;
        	attackRating = 1.0;
	}

	public String toString() {
		String health_ = "Health: " + health + System.lineSeparator();
		String strength_ = "Strength: " + strength + System.lineSeparator();
		String defense_ = "Defense: " + defense + System.lineSeparator();
		String attackRating_ = "Attack Rating: " + attackRating + System.lineSeparator();
		return health_ + strength + defense_ + attackRating_;
	}



}
