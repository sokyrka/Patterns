package org.patterns.behavioral.strategy;

import org.patterns.behavioral.strategy.behavior.EngineV12;
import org.patterns.behavioral.strategy.behavior.EngineV6;
import org.patterns.behavioral.strategy.behavior.EngineV8;
import org.patterns.behavioral.strategy.entity.Sedan;

/**
 * @author Eugine Sokirka
 */
public class StrategyDescription {

    /**
     * Стратегия - определяет семейство алгоритмов, инкапсулирует и обеспечивает их взаимозаменяемость(EngineBehavior).
     * Паттерн позволяет модифицировать алгоритмы независимо от их использования на стороне клиента.
     */

    public static void main(String[] args) {
        Sedan sedanV6 = new Sedan(new EngineV6());
        sedanV6.delegateStart();

        Sedan sedanV8 = new Sedan(new EngineV8());
        sedanV8.delegateStart();

        Sedan sedanV12 = new Sedan(new EngineV12());
        sedanV12.delegateStart();
    }
}
