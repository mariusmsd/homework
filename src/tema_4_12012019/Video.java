package tema_4_12012019;

public class Video {

	private String title;
	private boolean checked;
	private double user_rating;

	public Video(String title, boolean checked, double user_rating) {
		this.title = title;
		this.checked = checked;
		this.user_rating = user_rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public double getUser_rating() {
		return user_rating;
	}

	public void setUser_rating(double user_rating) {
		this.user_rating = user_rating;
	}
	
	

}
