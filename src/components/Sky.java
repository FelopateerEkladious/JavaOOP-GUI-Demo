package drawingTool;

import java.awt.Color;
import java.util.ArrayList;

public class Sky {
	private int width;
	private int height;
	private int locationX;
	private int locationY;
	private Sun sun; //composite
	private Cloud cloud1; //composite
	private Cloud cloud2; //composite
	private Moon moon; //composite
	private ArrayList<Star> stars; //composite
	private int dayTime;
	
	public Sky(int width, int height, int locationX, int locationY, int dayTime) {
		this.width = width;
		this.height = height;
		this.locationX = locationX;
		this.locationY = locationY;
		this.dayTime = dayTime;
		int morning = 1;
		int evening = 2;
		int night = 3;
		
		if (dayTime == morning) {
			int sunRiseWidth = width * 1/8;
			int sunRiseHeight = width * 1/8;
			int sunRiseLocationX = locationX + 120;
			int sunRiseLocationY = locationY + 20;
			int cloudWidth = width * 1/20;
			int cloudHeight = width * 1/20;
			int cloud1LocationX = locationX + 20;
			int cloud1LocationY = locationY+20;
			int cloud2LocationX = locationX + 900;
			int cloud2LocationY = locationY + 20;
			Sun sunRise = new Sun(sunRiseWidth, sunRiseHeight, sunRiseLocationX, sunRiseLocationY);
			sun = sunRise;
			cloud1 = new Cloud (cloudWidth, cloudHeight, cloud1LocationX, cloud1LocationY);
			cloud2 = new Cloud (cloudWidth, cloudHeight, cloud2LocationX, cloud2LocationY);
		}
		else if (dayTime == evening) {
			int sunSetWidth = width * 1/4;
			int sunSetHeight = width * 1/4;
			int sunSetLocationX = locationX + width/2 - (sunSetWidth/2);
			int sunSetLocationY = locationY;
			Sun sunSet = new Sun (sunSetWidth, sunSetHeight, sunSetLocationX, sunSetLocationY);
			sun = sunSet;
		}
		else if(dayTime == night) {
			int moonWidth = width * 1/8;
			int moonHeight = width * 1/8;
			int moonLocationX = locationX + width/2 - width * 3/8;
			int moonLocationY = locationY + 20;
			int starWidth = width * 1/64;
			int starHeight = width * 1/64;
			int maxStarsNumber = 20;
			moon = new Moon(moonWidth, moonHeight, moonLocationX, moonLocationY);
			stars = new ArrayList<Star>();
			for (int i = 1; i < maxStarsNumber * 1/4; i++) {
				Star star1 = new Star(starWidth, starHeight, moonLocationX + moonWidth * 1 * i, moonLocationY);
				Star star2 = new Star(starWidth, starHeight, moonLocationX + moonWidth * 3/2 * i, moonLocationY + starHeight * 5/2);
				Star star3 = new Star(starWidth, starHeight, moonLocationX + moonWidth * 2 * i, moonLocationY + starHeight * 5);
				Star star4 = new Star(starWidth, starHeight, moonLocationX + moonWidth * i, moonLocationY + starHeight * 15/2);
				stars.add(star1);
				stars.add(star2);
				stars.add(star3);
				stars.add(star4);
			}
		}
	}
	public void draw() {
		int morning = 1;
		int evening = 2;
		int night = 3;
		if (dayTime == morning) {
			Drawing.pen().setColor(Color.cyan);
			Drawing.pen().fillRect(locationX, locationY, width, height);
			sun.draw(Color.yellow);
			cloud1.draw();
			cloud2.draw();
		}
		else if (dayTime == evening) {
			Drawing.pen().setColor(Color.yellow);
			Drawing.pen().fillRect(locationX, locationY, width, height);
			sun.draw(Color.orange);
		}
		else if (dayTime == night){
			Color darkBlue = new Color(0,0,153);
			Drawing.pen().setColor(darkBlue);
			Drawing.pen().fillRect(locationX, locationY, width, height);
			moon.draw();
			for (Star star : stars)
				star.draw();
		}	
	}
}
