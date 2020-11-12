package jprieto.mastermind.views.console;

import jprieto.mastermind.models.SecretCombination;
import jprieto.mastermind.views.MessageView;
import jprieto.utils.Console;

class SecretCombinationView {

	void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		Console.instance().writeln();
	}

}
