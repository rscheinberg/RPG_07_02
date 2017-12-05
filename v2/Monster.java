public class Monster extends Character {

	public Monster() {
        	health = 150;
        	strength = (int) (Math.random()*45 + 20);
        	defense = 20;
        	attackRating = 1.0;
	}

	public String toString() {
		String health_ = "Health: " + heatlh + System.lineseparator();
		String strength_ = "Strength: " + strength + System.lineseparator();
		String defense_ = "Defense: " + defense + System.lineseparator();
		String attackRating_ = "Attack Rating: " + attackRating + System.lineseparator();
		return health_ + strength + defense_ + attackRating_;
	}



}
