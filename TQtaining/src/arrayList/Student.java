package arrayList;

public class Student {
          int id;
          String name;
          float per;
		public Student(int id, String name, float per) {
			super();
			this.id = id;
			this.name = name;
			this.per = per;
		}
	    @Override
	    public String toString()
	    {
	    	return "Student (Id------> "+id+", Name-----> "+ name+", Percentage-----> "+per +"%)";
	    }

}
