
public class Student {
	private String name;
	private int semester;
	private double gpa;
	
	public void setName(String studentName) {
		name = studentName;
	}
	
	public void setSemester(int sem) {
		semester = sem;
	}
	
	public void setGpa(double studentGpa) {
		gpa = studentGpa;
	}

	public String getName() {
		return name;
	}
	
	public int getSemester() {
		return semester;
	}
	
	public double getGpa() {
		return gpa;
	}
}
