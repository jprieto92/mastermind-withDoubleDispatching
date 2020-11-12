package jprieto.mastermind.views;

import jprieto.mastermind.models.Error;
import jprieto.mastermind.views.console.ColorView;

public class ErrorView {

	public static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.allInitials(), 
			"Wrong proposed combination length" };

	protected Error error;

	public ErrorView(Error error) {
		this.error = error;
	}

}
