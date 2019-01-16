package tema_4_12012019;

public class Video {

	private String title;
	private boolean checked_out=false;
	private double user_rating=0;
	private int rating_count=0;
	private double rating=0;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isChecked() {
		return checked_out;
	}
	public double getRating() {
		return rating;
	}

	public void rentVideo() {
		this.checked_out=true;
	}
	public void returnVideo() {
		this.checked_out=false;
	}
	public void setrating(double r) {
		this.user_rating=r;
		this.rating_count++;
		this.rating=this.rating+this.user_rating/this.rating_count;
	}

}
