import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int length;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
	    this.length=length;
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {

		return this.students[];
	}

	@Override
	public void setStudents(Student[] students) {

		// Add your implementation here
		  Scanner s= new Scanner(System.in);
	    int id;
	    String fullName;
	   String birthDate;
	   double avgMark;
		// Add your implementation here
		for(int i=0;i<length;i++)
        {
            id=s.nextInt();
              String full=s.next();
	    	    String name=s.next();
                 fullName=full+" "+name;
	    	    String year=s.next();
	    	    String month=s.next();
                String date=s.next();
                 birthDate=year+"-"+month+"-"+date;
                  avgMark=s.nextDouble();
            students[i]= new Student(id,fullName,birthDate,avgMarks);
        }
        }

	}

	@Override
	public Student getStudent(int index) {

		// Add your implementation here
		try{
		return this.students[index];
		}
		catch(Exception e)
		{

		}
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
		    if(student==null)
                    throw "IllegalArgumentException";
		this.students[index]=new Student(student);
		}
		catch(Exception e)
		{

		}
	}

	@Override
	public void addFirst(Student student) {

	    	try{
	    	    if(student==null)
                    throw "IllegalArgumentException";
	    this.students[0]=new Student(student);
	    }
		catch(Exception e)
		{

		}
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
	    	try{
	    	    if(student==null)
                    throw "IllegalArgumentException";
	    this.students[length-1]=new Student(student);
	    	}
		catch(Exception e)
		{

		}
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
	    try{
	        if(student==null)
                    throw "IllegalArgumentException";
		this.students[index]=new Student(student);
		}
		catch(Exception e)
		{

		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
	      try{  if(index<0||index>lngth)
                    throw "IllegalArgumentException";
	    this.students[index]=null;
	    }

		catch(Exception e)
		{

		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
	    for(int i=0;i<length;i++)
        {
            if(students[i].equals(student))){
            students[i]=null;break;

            }

        }
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
	     try{  if(index<0||index>lngth)
                    throw "IllegalArgumentException";
	   while(this.students[index]=null)
        index++;
	    }

		catch(Exception e)
		{

		}
students.removeIf(Objects::isNull);		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {

        for(int i=0;i<length;i++)
        {
            if(students[i].equals(student))){
            students[i]=null;break;

            }

        }
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here

	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		  int n = students.length;
        Student temp;
         for(int i=0; i < n; i++){
                 for(int j=1; j < (n-i); j++){
                          if(students[j-1].getId() > students[j].getId()){
                                 //swap elements
                                 temp = students[j-1];
                                 students[j-1] = students[j];
                                 students[j] = temp;
                         }

                 }
	}
	}
	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
