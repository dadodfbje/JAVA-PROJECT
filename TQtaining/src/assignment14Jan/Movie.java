package assignment14Jan;

public class Movie {
	int movieid; 
	String moviename; 
	double rating;
	public Movie(int movieid, String moviename, double rating) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", rating=" + rating + "]";
	}
	
	
	
	
	
}
