





public class BookDetails {
        
         
	public static Branch showcivil()
	{
	
	Books data[]=new Books[5];
	 data[0]=new Books(123,"DSS");
	 data[1]=new Books(125,"SOM");
	 data[2]=new Books(126,"TOM");
	 data[3]=new Books(127,"Fluid Mechanics");
	 data[4]=new Books(128,"Mechanics of Solid");
//	 data[5]=new Books(136,"ERBC",5);
	 Branch b=new Branch("Civil",data);
	
	return b;
	}
	 
	

		
		public static   Branch  showElectrical()
		{   
			Books data[]=new Books[5];
			 data[0]=new Books(123,"Thermodynamics");
			 data[1]=new Books(125,"Network Analysis");
			 data[2]=new Books(126,"FTQ");
			 data[3]=new Books(127,"BEDC");
			 data[4]=new Books(128,"DSP");
			// data[5]=new Books(136,"COTC",5);
			 Branch b=new Branch("Electrical",data);
			
			return b;
		}
		public static Branch  showComputerScience()
		{   
			Books data[]=new Books[5];
			 data[0]=new Books(123,"C#");
			 data[1]=new Books(125,"C++");
			 data[2]=new Books(126,"JAVA");
			 data[3]=new Books(127,"HTML");
			 data[4]=new Books(128,"MATHS");
			// data[5]=new Books(136,"CAT",5);
			
			 Branch b=new Branch("Electrical",data);
				
				return b;
		}
		public static void show()
		{
			
			System.out.println("Branches");
			System.out.println("1.Civil");
			System.out.println("2 Electrical");
			System.out.println("3 ComputerScience");
			
		}
		

		
		}
		
		
	

