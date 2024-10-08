package graphicState;

import drawingTool.Holiday;

public class NightState extends State{

	private NightState (Holiday context) {
		this.context = context;
		night = this ;
		}

	public static NightState getInstance( Holiday context) {
		if ( night == null ) {
			night = new NightState(context);
		}
		context.setNight();
		return night ;
	}
	
	@Override
	public State setMorning() {
		System.out.println("State Transition: Night ---> Morning");
		context.setMorning();
		return MorningState.getInstance(context) ;
	}
	
	@Override
	public State setEvening() {
		System.out.println("State Transition: Night ---> Evening");
		context.setEvening();
		return EveningState.getInstance(context);
	}
	
	@Override
	public State setNight() {
		System.out.println("The state is already Night");
		return this;
	}
}
