package graphicState;

import drawingTool.Holiday;

public class MorningState extends State{

	private MorningState(Holiday context) {
		this.context = context;
		morning = this ;
	}

	public static MorningState getInstance( Holiday context) {
		if ( morning == null ) {
			morning = new MorningState(context);
		}
		context.setMorning();
		return morning ;
	}
	
	@Override
	public State setMorning() {
		System.out.println("The state is already Morning");
		return this ;
	}
	
	@Override
	public State setEvening() {
		System.out.println("State Transition: Morning ---> Evening");
		context.setEvening();
		return EveningState.getInstance(context);
	}
	
	@Override
	public State setNight() {
		System.out.println("State Transition: Morning ---> Night");
		context.setNight();
		return NightState.getInstance(context);
	}
}
