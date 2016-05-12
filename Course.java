
public class Course {
	private String ID;
	private String name;
	private String subject;
	private String preReq;
	private String lecturer;

	//constructor
	public Course(String coID, String coName, String coSubject, String coPreReq,String coLecturer)
	{
		this.ID = coID;
		this.name = coName;
		this.subject = coSubject;
		this.preReq = coPreReq;
		this.lecturer = coLecturer;
	}
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return ID;
	}
	public String getSubject()
	{
		return subject;
	}
	public String getPreReq()
	{
		return preReq;
	}
	public String getLecturer()
	{
		return lecturer;
	}
	public void printDetails()
	{
	System.out.println("Course ID: "+ID);
	System.out.println("Course name: "+name);
	System.out.println("Course Subject: " +subject);
	System.out.println("Course pre-requisite: "+preReq);
	System.out.print("Course Lecturer: "+lecturer);
	System.out.println("************************************************");
	}
}
