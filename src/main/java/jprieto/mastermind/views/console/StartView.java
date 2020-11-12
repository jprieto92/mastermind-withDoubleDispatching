package jprieto.mastermind.views.console;

import jprieto.mastermind.controllers.StartController;
import jprieto.mastermind.views.MessageView;

class StartView {

	void interact(StartController startController) {
		MessageView.TITLE.writeln();
		startController.setUser();
		MessageView.ATTEMPTS.writeln(0);
	    new SecretCombinationView().writeln();
	}

}