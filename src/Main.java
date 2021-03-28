
public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Lisa");
		student1.setSemester(2);
		student1.setGpa(4.0);
		
		System.out.println("Student name: " + student1.getName());
		System.out.println("Semester: " + student1.getSemester());
		System.out.println("GPA: " + student1.getGpa());
		
		System.out.println();
		
		Student student2 = new Student();
		student2.setName("Louis");
		student2.setSemester(5);
		student2.setGpa(3.5);
		
		System.out.println("Student name: " + student2.getName());
		System.out.println("Semester: " + student2.getSemester());
		System.out.println("GPA: " + student2.getGpa());
		}

}
