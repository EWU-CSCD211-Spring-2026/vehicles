
package model;

/**
 * Represents a Person
 */
public class Person {

    private String name;
    private boolean leftHanded;

    public Person(String name) {
        this(name, false);
    }

    /**
     * Initialize a person
     * @param name the name of the person
     * @param leftHanded whether the person is left handed
     */
    public Person(String name, boolean leftHanded) {
        this.name = name;
        this.leftHanded = leftHanded;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", leftHanded=" + leftHanded +
                '}';
    }

}
