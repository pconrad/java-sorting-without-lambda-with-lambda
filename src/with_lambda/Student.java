package with_lambda;

public class Student {


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


	System.out.println("Sort dat arraylist by lname");

	java.util.Collections.sort(classroom, (s1, s2) ->
			 s1.getName().compareTo(s2.getName()));
	System.out.println("sorted by lname classroom=" + classroom);	

	System.out.println("Sort dat arraylist by perm");

	java.util.Collections.sort(classroom, (s1, s2) ->
				   s1.getPerm() -  s2.getPerm());

	System.out.println("sorted by perm classroom=" + classroom);	


    }
    
}
    
