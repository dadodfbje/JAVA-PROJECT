package assignment14Jan;

public class Theatre {
	/*Create an array of Theatre to maintain data in sorted order of Movie Rating
	Theatre (Theatreid, Theatrename, location, Movie)
	Movie (Movieid, Moviename, Rating).*/
	
		int theatreid;
		String theatrename; 
		String location;
		Movie movie;
		public Theatre(int theatreid, String theatrename, String location, Movie movie) {
			super();
			this.theatreid = theatreid;
			this.theatrename = theatrename;
			this.location = location;
			this.movie = movie;
		}
		@Override
		public String toString() {
			return "Theatre [theatreid=" + theatreid + ", theatrename=" + theatrename + ", location=" + location
					+ ", movie=" + movie + "]";
		}
		
	
}

 