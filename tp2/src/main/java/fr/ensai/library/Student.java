package fr.ensai.library;

public class Student extends Person {

    // Attributs spécifique à Student
    int academicYear;
    boolean isClassDelegate;

    //Constructor
    /**
     * @param name
     * @param age
     * @param academicYear
     * @param isClassDelegate
     */
    public Student(String name, int age, int academicYear, boolean isClassDelegate){
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }


    
}
