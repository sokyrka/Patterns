package org.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Eugine Sokirka
 */
public class CompositeComponent extends Component {
    private String name;
    private String description;
    private ArrayList<Component> childs;

    public CompositeComponent(String name, String description) {
        this.name = name;
        this.description = description;
        this.childs = new ArrayList<Component>();
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
    public void addComponent(Component component) {
        childs.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        super.removeComponent(component);
    }

    @Override
    public Component getChild(int index) {
        return childs.get(index);
    }

    @Override
    public void print() {
        System.out.println("Composite: " + name + " " + description);
        Iterator iterator = childs.iterator();
        while (iterator.hasNext()) {
            ((Component) iterator.next()).print();
        }
    }
}
