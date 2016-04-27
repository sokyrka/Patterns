package org.patterns.structural.composite;

/**
 * @author Eugine Sokirka
 */
public class Leaf extends Component {
    private String name;
    private String description;

    public Leaf(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.println(" * Leaf: " + name + " " + description);
    }
}
