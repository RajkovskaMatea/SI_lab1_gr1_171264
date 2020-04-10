class Student {
	String index;
	String firstName;
	String lastName;
        int[5] labPoints;
	//TODO constructor
        Student(String index,String firstName,String lastName,int[] labPoints)
        {
         this.index=index;
         this.firstName=firstName;
         this.lastName=lastName;
         for(int i=0; i<5; i++)
         {
          this.labPoints=lab.Points;
         }
        }

	//TODO seters & getters

	public double getAverage() {
		//TODO
	}

	public boolean hasSignature() {
		//TODO
	}
        String getFirstName(){return firstName};
        String getLastName(){return lastName};
        
        void set index(int i)
        {
         this.index=i;
        }
        
}
class Course{
List<Student> students = new ArrayList<Student>();
}
