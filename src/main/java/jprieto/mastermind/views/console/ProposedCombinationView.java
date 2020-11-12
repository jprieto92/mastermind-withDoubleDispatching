package jprieto.mastermind.views.console;

import jprieto.mastermind.models.Color;
import jprieto.mastermind.models.Error;
import jprieto.mastermind.models.ProposedCombination;
import jprieto.mastermind.views.MessageView;
import jprieto.utils.Console;

public class ProposedCombinationView {
	
	private ProposedCombination proposedCombination;

	ProposedCombinationView() {
		this.proposedCombination = new ProposedCombination();
	}

	public void write() {
		for (Color color: this.proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}

	public ProposedCombination read() {
		Console console = Console.instance();
		Error error;
		do {
			error = Error.NULL;
			MessageView.PROPOSED_COMBINATION.write();
			String characters = console.readString();
			error = this.proposedCombination.setCombination(characters);
			if (error != Error.NULL) {
				new ErrorView(error).writeln();
				this.proposedCombination.getColors().clear();
			}
		} while (error != Error.NULL);
		return this.proposedCombination;
	}
}
