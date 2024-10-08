package graphicState;

import drawingTool.Holiday;

public abstract class State {
	protected Holiday context;

	 protected static MorningState morning;
	 protected static EveningState evening ;
	 protected static NightState night ;

	 public abstract State setMorning();

	 public abstract State setEvening();

	 public abstract State setNight() ;
}
