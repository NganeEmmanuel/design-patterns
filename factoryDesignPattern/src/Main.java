import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EnemyShip ufoShip;
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What kind of ship ? (U / R / B)");
        ufoShip = enemyShipFactory.makeEnemyShip(userInput.hasNextLine()? userInput.nextLine() : "U");


        doStuffEnemy(ufoShip);
    }

    private static void doStuffEnemy(EnemyShip ufoShip) {
        ufoShip.displayEnemyShip();
        ufoShip.followHeroShip();
        ufoShip.shootEnemyShip();
    }
}