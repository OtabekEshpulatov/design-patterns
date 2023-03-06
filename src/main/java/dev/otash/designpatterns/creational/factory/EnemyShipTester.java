package dev.otash.designpatterns.creational.factory;

import java.util.Objects;
import java.util.Scanner;

public class EnemyShipTester {


    /**
     * Having capability of classes to be chosen at runtime
     * <p> <br/><br/>
     * 1. Classes that objects to be generated should have the same root class that all other classes inherit from. <br/>
     * 2. Object creation should be encapsulated
     */

    public static void main(String[] args) {


        EnemyShipFactory shipFactory = new EnemyShipFactory();
        Scanner scanner = new Scanner(System.in);


        while ( true ) {
            EnemyShip enemyShip;
            System.out.println("What type of ship ( U / R / B)");

            if ( scanner.hasNextLine() ) {
                String typeOfShip = scanner.nextLine();
                enemyShip = shipFactory.makeEnemyShip(typeOfShip);

                if ( Objects.nonNull(enemyShip) ) {
                    doStuffEnemy(enemyShip);
                } else {
                    System.out.println("Cannot find this type of ship");
                }
            }
        }
    }


    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
