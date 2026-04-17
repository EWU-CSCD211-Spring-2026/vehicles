
package model;

/**
 * Represents a Person
 */
public class Person extends Object {

    private String name;

    /**
     * Initialize a person
     * @param name the name of the person
     */
    
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "plus my own string";
    }

}
