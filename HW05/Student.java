class Student
{
	private String name;
	private int marks=0, count=0;
	public Student(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void addExam(int mark) {
		this.marks+=mark;
		this.count+=1;
	}
	public int getTotal()	{
		return this.marks;
	}
	public double getMeanMark() {
		return ((double) this.marks)/this.count;
	}
}
