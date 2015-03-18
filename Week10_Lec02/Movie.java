class Video {
	String title; // name of the item
	int length; // number of minutes
	boolean avail; // is the video in the store?

	// constructor
	public Video(String ttl) {
		title = ttl;
		length = 90;
		avail = true;
	}

	// constructor
	public Video(String ttl, int lngth) {
		title = ttl;
		length = lngth;
		avail = true;
	}

	public String toString() {
		return title + ", " + length + " min. available:" + avail;
	}
}

class Movie extends Video {
	String director; // name of the director
	String rating; // G, PG, R, or X

	// constructor
	public Movie(String ttl, int lngth, String dir, String rtng) {
		super(ttl, lngth); // use the base class's constructor to initialize
							// members inherited from it
		director = dir; // initialize what's new to Movie
		rating = rtng;
	}
}