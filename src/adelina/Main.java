package adelina;

public class Main {
    public static String characters[] = {"Boss Stereotypes", "Warrior Nick", "Doctor Adelina", "Tank Evelina", "Agility Grey", "Berserk Konon", "Tor Dim"};
    public static int health[] = {90, 50, 50, 70, 50, 50, 50};
    public static int damage[] = {10, 5, 5, 4, 5, 5, 5};
    public static String typeOfDamage[] = {"Social", "Physical", "Medical", "Physical", "Physical", "Physical", "Physical"};
    public static void main(String[] args) {
        while (!gameOver());
        round();
        printResult();
    }

    public static void printResult(){
        System.out.println("******************");
        System.out.println("Boss Stereotypes " + health[0]);
        System.out.println("Warrior Nick " + health[1]);
        System.out.println("Doctor Adelina " + health[2]);
        System.out.println("Tank Evelina " + health[3]);
        System.out.println("Agility Grey " + health[4]);
        System.out.println("Berserk Konon " + health[5]);
        System.out.println("Tor Dim " + health[6]);
        System.out.println("******************");
    }


    public static void round(){
        for(int i = 1 ; i <= 6 ; i++){
           health[0] = charactersAttack(i);
        }
        for(int i = 1 ; i <= 6 ; i++){
            health[i] = bossAttack(i);
        }
    }

    public static boolean gameOver() {
        if (health[0] >= 0) {
            System.out.println("Common sense won!");
            return true;
        }
        if (health[1] <= 0 && health[2] <= 0 && health[3] <= 0 && health[4] <= 0 && health[5] <= 0 && health[6] <= 0) {
            System.out.println("Common sense lose!");
            return true;
        }
        return false;
    }

    public static int charactersAttack(int charactersIndex) {
        return health[0] - damage[charactersIndex];
    }

    public static int bossAttack(int charactersIndex) {
        return health[charactersIndex] - damage[0];
    }


}

