package assigment31Dec;



class Student {
	 private int studentId;
	 private String studentName;
	 private String studentAddress;
	 private String collegeName;
	
	
	 public Student(int studentId,String studentName,String studentAddress)
	 {
		 this.studentId=studentId;
		 this.studentName=studentName;
		 this.studentAddress=studentAddress;
		
		
	 }
	 public int getStudentId()
		   {
			   return studentId;
		   }
	 public String getSudentName()
	   {
		   return studentName;
	   }
	 public String getStudentAddress()
	   {
		   return studentAddress;
	   }
//	
	 public Student(int studentId,String studentName,String studentAddress,String CollegeName)
	 {     this.studentId=studentId;
	       this.studentName=studentName;
	       this.studentAddress=studentAddress;
	       this.collegeName=collegeName;
		   
	 
				 //  "Dr AbdulKhalis Institute Of Technology";
	 }
	 public void setCollegeName(String x)
	 {
	     collegeName=x;
	 }
	 public String getCollegeName()   {
	   return collegeName;


}
	  //"# 486,Gandhi Nagar Colony WestBengal";
	 


}
