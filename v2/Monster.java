public class Monster extends Character {

  public Monster() {
    health = 150;
    strength = (int) (Math.random()*45 + 20);
    defense = 20;
    attackRating = 1.0;
  }

}
