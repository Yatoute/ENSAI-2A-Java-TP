package fr.ensai.library;

public class Person {

    // Attributs
    protected String name;
    protected int age;

    // Constructors
    /**
     * @param name
     * @param age
     */
    public Person(String name){
        this.name = name ;
        this.age = 0;
    }

    public Person(String name, int age){
        this.name = name ;
        this.age = age;
    }
    
}
