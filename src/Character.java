public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Non Parameterized Constructor
     */
    Character() {
        characterName = "Entity";
        level = 1;
        healthPoints = 100;
        manaPoints = 100;
    }

    /**
     * Parameterized constructor initializing healthPoints, level, characterName, and mana
     */
    Character(String name, int lvl, int hp, int mana) {
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mana;
    }

    /**
     * Method that displays the name of the character
     */
    public void displayName() {
        System.out.println("Character Initialized : " + characterName);
    }

    /**
     * Method to damage target character
     */
    public void damageTarget(Character character, Character enemyCharacter, int damagePoints, int mana){
        /**
         * Deduct health points from enemy character
         * Deduct mana from character
         * Displays enemy's current hp
         */
        enemyCharacter.healthPoints -= damagePoints;
        character.manaPoints = character.manaPoints - mana;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);
        System.out.println("\n");

        /**
         * Prompt character is defeated if HP falls below 0
         * Levels up character if enemy is defeated
         */
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
            levelUp(character);
        }
    }

    /**
     * Method that increases level by 10
     */
    public void levelUp(Character character) {
        character.level += 10;
        System.out.println(character.characterName + " leveled up.");
    }

    /**
     * Method that displays character details
     */
    public void displayStats() {
        System.out.println("Character : " + characterName);
        System.out.println("Level : " + level);
        System.out.println("Health : " + healthPoints);
        System.out.println("Mana : " + manaPoints);
        System.out.println("\n");
    }

    /**
     * Method that displays the winner
     */
    public void displayWinner() {
        if(healthPoints >= 1) {
            System.out.println(characterName + " wins!");
        }
    }
}