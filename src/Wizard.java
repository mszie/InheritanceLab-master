public class Wizard extends Character{
    /**
     * Wizard class that inherits the properties of character class
     */
    Wizard(String name, int lvl, int hp, int mana){
        super(name, lvl, hp, mana);
    }

    /**
     * Methods consisting of Wizard damage and recover spells
     * Invokes damageTarget method from character class
     */
    /** 
     * Method consisting of spell that has 50 damage and 35 mana cost
     */
    public void fireStorm (Character character, Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50) (Mana - 35)");
        int damagePoints = 50;
        int mana = 35;
        damageTarget(character, enemyCharacter, damagePoints, mana);
    }

    /**
     * Method consisting of spell that has 80 damage and 50 mana cost
     */
    public void blackHole (Character character, Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Black Hole (Damage - 80) (Mana - 50)");
        int damagePoints = 80;
        int mana = 50;
        damageTarget(character, enemyCharacter, damagePoints, mana);
    }

    /**
     * Method consisting of spell that increases both HP and Mana Points
     */
    public void heavensHeal() {
        System.out.println(super.characterName + " casts Heaven's Heal (Health + 50) (Mana + 30)");
        super.healthPoints += 50;
        super.manaPoints += 30;
    }
}
