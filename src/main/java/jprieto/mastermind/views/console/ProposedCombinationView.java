package jprieto.mastermind.views.console;

import jprieto.mastermind.models.Color;
import jprieto.mastermind.models.Error;
import jprieto.mastermind.models.ProposedCombination;
import jprieto.mastermind.views.MessageView;
import jprieto.utils.Console;

public class ProposedCombinationView {
	
	public void write() {
		ProposedCombination proposedCombination = new ProposedCombination();
		for (Color color: proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}

	public ProposedCombination read() {
		ProposedCombination proposedCombination = new ProposedCombination();
		Console console = Console.instance();
		Error error;
		do {
			error = Error.NULL;
			MessageView.PROPOSED_COMBINATION.write();
			String characters = console.readString();
			error = proposedCombination.setCombination(characters);
			if (error != Error.NULL) {
				new ErrorView(error).writeln();
				proposedCombination.getColors().clear();
			}
		} while (error != Error.NULL);
		return proposedCombination;
	}
}
