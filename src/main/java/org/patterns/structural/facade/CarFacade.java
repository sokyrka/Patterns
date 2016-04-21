package org.patterns.structural.facade;

/**
 * @author Eugine Sokirka
 */
public class CarFacade {
    private Door door;
    private Seat seat;
    private Belt belt;
    private Key key;
    private Engine engine;

    public CarFacade(Door door, Seat seat, Belt belt, Key key, Engine engine) {
        this.door = door;
        this.seat = seat;
        this.belt = belt;
        this.key = key;
        this.engine = engine;
    }

    public void driveByCar() {
        door.openDoor();
        seat.sitUp();
        door.closeDoor();
        belt.fastenBelt();
        key.insertKey();
        key.turnKey();
        engine.checkEngine();
        key.turnKey();
        engine.startEngine();
    }

    public void stopDriveByCar() {
        key.turnKey();
        engine.stopEngine();
        key.removeKey();
        belt.unfastenBelt();
        door.openDoor();
        seat.getUp();
        door.closeDoor();
    }
}
