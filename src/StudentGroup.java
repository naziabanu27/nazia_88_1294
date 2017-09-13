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
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	LinkedList<Student> st = new LinkedList<Student>();
	static int l;
	public StudentGroup(int length) {
		this.students = new Student[length];
		l=length;
		Scanner s= new Scanner(System.in);
		for(int i=0;i<length;i++)
		{
			students[i]=s.next();
		}
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		Student[] arr = st.toArray(new Student[st.size()]);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		for(int j=0;j<l;j++)
		{
			st.add(students[i]);
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		System.out.println(st.get(index));
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		st.set(index,student);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		st.addFirst(student);
		
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		st.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		st.add(index,student);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		st.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		st.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		st.sublist(index,l).clear();
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int in=st.indexOf(student);
			{
				removeFromIndex(in);
			}
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		st.sublist(0,index).clear();
		
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		for(Student a : st)
		{
			if(a.birthDate == date)
				System.out.println(id+" "+fullName+" "+birthDate+" "+avgMark);
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		for(Student a : st)
		{
			if(a.birthDate > firstDate && a.birthDate)
				System.out.println(id+" "+fullName+" "+birthDate+" "+avgMark);
		}
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
