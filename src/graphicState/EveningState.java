package graphicState;

import drawingTool.Holiday;

public class EveningState extends State{

	private EveningState(Holiday context) {
		this.context = context;
		evening = this ;
		System.out.println("It seems like the initial state is Evening");
	}

	public static EveningState getInstance( Holiday context) {
		if ( evening == null ) {
			evening = new EveningState(context);
		}
		context.setEvening();
		return evening ;
	}
	
	@Override
	public State setMorning() {
		System.out.println("State Transition: Evening ---> Morning");
		context.setMorning();
		return MorningState.getInstance(context) ;
	}
	
	@Override
	public State setEvening() {
		System.out.println("The state is already Evening");
		return this;
	}
	
	@Override
	public State setNight() {
		System.out.println("State Transition: Evening ---> Night");
		context.setNight();
		return NightState.getInstance(context);
	}
}
