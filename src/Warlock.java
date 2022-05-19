public class Warlock extends Character{
    /**
     * Warlock class that inherits the properties of character class
     */
    Warlock(String name, int lvl, int hp, int mana){
        super(name, lvl, hp, mana);
    }
    
    /**
     * Methods consisting of Warlock damage and recover spells
     * Invokes damageTarget method from character class
     */
    /** 
     * Method consisting of spell that has 45 damage and 35 mana cost
     */
    public void agony (Character character, Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Agony (Damage - 45) (Mana - 35)");
        int damagePoints = 45;
        int mana = 35;
        damageTarget(character, enemyCharacter, damagePoints, mana);
    }

    /**
     * Method consisting of spell that has 85 damage and 50 mana cost
     */
    public void chaosBolt (Character character, Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Chaos Bolt (Damage - 85) (Mana - 50)");
        int damagePoints = 85;
        int mana = 50;
        damageTarget(character, enemyCharacter, damagePoints, mana);
    }

    /**
     * Method consisting of spell that increases both HP and Mana Points
     */
    public void bloodLust() {
        System.out.println(super.characterName + " casts Blood Lust (Health + 30) (Mana + 30)");
        super.healthPoints += 40;
        super.manaPoints += 30;
    }
}
