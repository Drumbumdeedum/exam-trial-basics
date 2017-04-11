package pirates;

public class Pirate {
  String name;
  boolean hasWoodenLeg;
  int gold;

  public Pirate(String name, boolean hasWoodenLeg, int gold) {
    this.name = name;
    this.hasWoodenLeg = hasWoodenLeg;
    this.gold = gold;
  }

  public boolean filterPirates() {
    if (this.hasWoodenLeg == true && this.gold > 15) {
      return true;
    } else {
      return false;
    }
  }

  public String getName() {
    return this.name;
  }
}
