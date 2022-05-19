public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Wizards and Warlocks \n");

        //Wizard and Warlock object class inheriting Character Class
        Wizard wizard = new Wizard("Wizard", 1, 200, 200);
        Warlock warlock = new Warlock("Warlock", 1, 200, 200);

        // displays character details
        wizard.displayName();
        wizard.displayStats();
        warlock.displayName();
        warlock.displayStats();

        System.out.println(wizard.characterName + " vs." + warlock.characterName);
        System.out.println("--------------------------");
        System.out.println("ROUND 1");
        wizard.blackHole(wizard, warlock); // Warlock HP deducted
        warlock.chaosBolt(warlock, wizard); // Wizard HP deducted
        // displays character details
        wizard.displayStats();
        warlock.displayStats();
        
        System.out.println("--------------------------");
        System.out.println("ROUND 2");
        warlock.agony(warlock, wizard); // Wizard HP deducted
        wizard.heavensHeal(); // Wizard HP and Mana increases
        // displays character details
        wizard.displayStats();
        warlock.displayStats();

        System.out.println("--------------------------");
        System.out.println("ROUND 3");
        wizard.fireStorm(wizard, warlock); // Warlock HP deducted
        warlock.agony(warlock, wizard); // Wizard HP deducted
        // displays character details
        wizard.displayStats();
        warlock.displayStats();

        System.out.println("--------------------------");
        System.out.println("ROUND 4");
        warlock.agony(warlock, wizard); // Wizard HP deducted
        wizard.blackHole(wizard, warlock); // Warlock HP deducted
        // displays character details
        wizard.displayStats();
        warlock.displayStats();

        // displays the winner
        System.out.println("--------------------------");
        wizard.displayWinner();
        warlock.displayWinner();
    }
}
