//Parameterized constructor
public class Student {
	int rollno;
	String name;
	Student(int rollno, String name){//constructor
		this.rollno=rollno;
		this.name=name;
	}
	void display() {
		System.out.println(rollno+ " "+name);
	}
public static void main(String args[]) {
	Student s=new Student(111,"Arun Kumar");
	s.display();
	Student s1=new Student(112,"Rechard");
	s1.display();
	Student s2=new Student(111,"Raju");
	s2.display();
	Student s3=new Student(111,"Maha Lakshmi");
	s3.display();
	}
	}

