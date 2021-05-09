public class ZombieKiller {
    public static void main(String[] args) {
        System.out.println(("Welcome to the Zombie Killer Program!"));

        String backpack[] = {"Rifle", "Shotgun", "Sniper"};
        String zombies[] = {"Close-range Zombie", "Mid-range Zombie", "Long-range Zombie"};

        System.out.println("\nHere are your backpack items:");
        System.out.println("---------");

        for(String backpackItem : backpack) {
            System.out.println(backpackItem);
        }

        System.out.println("---------");
        System.out.println("Here are the ZOMBIES!:");
        System.out.println("---------");

        for(int i = 0; i < zombies.length; i++) {
            System.out.println(zombies[i]);
        }

        System.out.println("---------");
    }
}
