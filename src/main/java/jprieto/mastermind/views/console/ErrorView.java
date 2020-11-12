package jprieto.mastermind.views.console;

import jprieto.mastermind.models.Error;
import jprieto.utils.Console;

public class ErrorView extends jprieto.mastermind.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	void writeln() {
		Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}

}
