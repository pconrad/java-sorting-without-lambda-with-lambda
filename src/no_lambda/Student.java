package no_lambda;

import java.util.Comparator;

public class Student implements Comparable<Student> {
        
    @Override public int compareTo(Student s) {
	return this.getPerm() - s.getPerm();
    }
    
    public static Comparator<Student> StudentComparatorByName =
	new Comparator<Student>() {
	    public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	    }
	};
    
    private int perm;
    private String lname;

    public Student(int perm, String lname) {
	this.perm = perm;
	this.lname = lname;
    }

    public int getPerm() { return this.perm;}
    public String getName() { return this.lname;}

    public String toString() {
	return "[" + this.perm + "," + this.lname + "]";
    }

    public static void main(String [] args) {
	java.util.ArrayList<Student> classroom =
	    new java.util.ArrayList<Student>();
	classroom.add(new Student(1234567,"Smith"));
	classroom.add(new Student(3345678,"Jones"));
	classroom.add(new Student(2456789,"Perez"));		  
	System.out.println("classroom=" + classroom);

	java.util.Collections.sort(classroom);
	System.out.println("sorted by perm classroom=" + classroom);
	
	java.util.Collections.sort(classroom,StudentComparatorByName);
	System.out.println("sorted by name classroom=" + classroom);	



    }
    
}
    
