package jprieto.mastermind;

import jprieto.mastermind.views.console.ConsoleView;

public class ConsoleMasterMind extends MasterMind {

	@Override
	protected ConsoleView createView(){
		return new ConsoleView();
	}

	public static void main(String[] args) {
		new ConsoleMasterMind().play();
	}

}