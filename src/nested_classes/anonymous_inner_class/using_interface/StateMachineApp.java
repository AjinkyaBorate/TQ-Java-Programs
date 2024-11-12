package nested_classes.anonymous_inner_class.using_interface;

/*3.Create a state machine simulation using an interface called State. 
Define two states: StartState and StopState. Each state should implement the doAction() method 
from the State interface. Use non-static inner classes in an outer class named StateMachineApp 
to represent these states. The outer class should maintain the current state and switch between 
the states, printing messages to show the current action.*/
interface State {
	public void doAction();
}

public class StateMachineApp {
	State currentState;

	StateMachineApp() {
		currentState = null;
	}

	public void state(State cs) {
		this.currentState = cs;
	}

	public void doAction() {
		if (currentState != null) {
			currentState.doAction();
		} else {
			System.out.println("No State");
		}
	}

	class StartState implements State {
		@Override
		public void doAction() {
			System.out.println("Current State is Start");
		}
	}

	class StopState implements State {
		public void doAction() {
			System.out.println("Current State is Stop");

		}
	}

	public static void main(String[] args) {
		StateMachineApp sa = new StateMachineApp();
		StateMachineApp.StartState start = sa.new StartState();
		StateMachineApp.StopState stop = sa.new StopState();

		start.doAction();
		stop.doAction();

	}

}
