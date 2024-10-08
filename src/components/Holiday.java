package drawingTool;

import graphicState.EveningState;
import graphicState.MorningState;
import graphicState.NightState;
import graphicState.State;


import java.util.ArrayList;

public class Holiday {
	private Beach beach; //composite
	private Sea sea; //composite
	private Sky sky; //composite
	private ArrayList<LocatedRectangle> creatures; //aggregate
	private State graphicState;

	public Holiday(DrawingArea drawingArea) {
		graphicState = MorningState.getInstance(this);
	}

	public void setLions() {
		int maximumLionsNumber = 25;
		creatures.clear();
		for (int i = 1; i < maximumLionsNumber; i++) {
			Lion lion = new Lion(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			if(vacantProperty(lion)) {
				creatures.add(lion);
				System.out.println("Lion added: " + i);
			}
			else
				System.out.println("no space for this Lion: " + i);
		}
		System.out.println("setLions was called");
	}

	public void setOneLion() {
		creatures.clear();
		Lion lion = new Lion(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
		if(vacantProperty(lion))
			creatures.add(lion);
		else
			System.out.println("Busy Spot to insert a Lion");
		System.out.println("setOneLion was called");
	}

	public void setHumans() {
		int maximumHumansNumber = 25;
		creatures.clear();
		for (int i = 1; i < maximumHumansNumber; i++) {
			Human human = new Human(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			if(vacantProperty(human)) {
				creatures.add(human);
				System.out.println("Human added: " + i);
			}
			else
				System.out.println("no space for this Human: " + i);
		}
		System.out.println("setHumans was called");
	}

	public void setOneHuman() {
		creatures.clear();
		Human human = new Human(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
		if(vacantProperty(human))
			creatures.add(human);
		else
			System.out.println("Busy Spot to insert a Human");
		System.out.println("setOneHuman was called");
	}

	public void setLionsAndHumans() {
		creatures.clear();
		int maximumCreaturesNumber = 50;
		for (int i = 1; i < maximumCreaturesNumber; i++) {
			Lion lion = new Lion(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			Human human = new Human(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			if(vacantProperty(lion))
				creatures.add(lion);
			if(vacantProperty(human))
				creatures.add(human);
		}
		System.out.println("setLionsAndHumans was called");
	}

	public void setRandomDaytime() {
		int morning = 1;
		int evening = 2;
		int night = 3;
		int dayTime = RandomNumber.between(morning, night);
		if (dayTime == morning) {
			System.out.println("Good Morning!");
			graphicState = graphicState.setMorning();
		}
		else if (dayTime == evening) {
			System.out.println("Good Evening!");
			graphicState = graphicState.setEvening();
		}
		else {
			System.out.println("Good Night!");
			graphicState = graphicState.setNight();
		}
		System.out.println("setRandomDaytime was called");
	}
	
	public void generateMorningState() {
		graphicState = graphicState.setMorning();
	}
	
	public void setMorning() {
		int morning = 1;
		beach = new Beach(1600, 250, 0, 550);
		sea = new Sea(1600, 250, 0, 300);
		sky = new Sky(1600, 300, 0, 0, morning);
		creatures = new ArrayList<LocatedRectangle>();
		int maximumCreaturesNumber = 50;
		for (int i = 1; i < maximumCreaturesNumber; i++) {
			Lion lion = new Lion(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			Human human = new Human(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			if(vacantProperty(lion))
				creatures.add(lion);
			if(vacantProperty(human))
				creatures.add(human);
		}
		System.out.println("Good Morning!");
		System.out.println("setMorning was called");
		
	}
	
	public void generateEveningState() {
		graphicState = graphicState.setEvening();
	}
	
	public void setEvening() {
		int evening = 2;
		beach = new Beach(1600, 250, 0, 550);
		sea = new Sea(1600, 250, 0, 300);
		sky = new Sky(1600, 300, 0, 0, evening);
		creatures = new ArrayList<LocatedRectangle>();
		int maximumCreaturesNumber = 50;
		for (int i = 1; i < maximumCreaturesNumber; i++) {
			Lion lion = new Lion(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			Human human = new Human(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			if(vacantProperty(lion))
				creatures.add(lion);
			if(vacantProperty(human))
				creatures.add(human);
		}
		System.out.println("Good Evening!");
		System.out.println("setEvening was called");
	}
	
	public void generateNightState() {
		graphicState = graphicState.setNight();
	}
	
	public void setNight() {
		int night = 3;
		beach = new Beach(1600, 250, 0, 550);
		sea = new Sea(1600, 250, 0, 300);
		sky = new Sky(1600, 300, 0, 0, night);
		creatures = new ArrayList<LocatedRectangle>();
		int maximumCreaturesNumber = 50;
		for (int i = 1; i < maximumCreaturesNumber; i++) {
			Lion lion = new Lion(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			Human human = new Human(RandomNumber.between(150, 250),RandomNumber.between(150, 350), RandomNumber.between(250, 1250), RandomNumber.between(400, 450));
			if(vacantProperty(lion))
				creatures.add(lion);
			if(vacantProperty(human))
				creatures.add(human);
		}
		System.out.println("Good Night!");
		System.out.println("setNight was called");
	}
	
	public void clear() {
		creatures.clear();
		System.out.println("clear method was called");
	}
	
	private boolean vacantProperty(LocatedRectangle newCreature) {
		boolean anyIntersection = false;
		for (LocatedRectangle creature : creatures)
			anyIntersection = anyIntersection || creature.intersects(newCreature);
		return !anyIntersection;
	}

	public void draw() {
		sky.draw();
		sea.draw();
		beach.draw();
		for (LocatedRectangle creature : creatures) {
			creature.draw();
		}
	}
}
