package dev.otash.designpatterns.creational.factory;

public class EnemyShipFactory {


    public EnemyShip makeEnemyShip(String newShipType) {
        return switch ( newShipType ) {
            case "U" -> new UFOEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            default -> null;
        };
    }
}
