package org.patterns.structural.facade;

/**
 * @author Eugine Sokirka
 */
public class FacadeDescription {

    /**
     * Фасад - предоставляет унифицированный интерфейс к группе интерфейсов подсистемы. Фасад определяет высокоуровневый
     * интерфейс, упрощающий работу с подсистемой.
     */

    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade(new Door(), new Seat(), new Belt(), new Key(), new Engine());
        carFacade.driveByCar();
        carFacade.stopDriveByCar();
    }
}
