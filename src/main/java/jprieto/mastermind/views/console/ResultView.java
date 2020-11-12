package jprieto.mastermind.views.console;

import jprieto.mastermind.models.Color;
import jprieto.mastermind.models.ProposedCombination;
import jprieto.mastermind.models.Result;
import jprieto.mastermind.views.MessageView;

public class ResultView {
	
	private Result result;
	private ProposedCombination combination;

	ResultView(ProposedCombination combination, Result result) {
		this.result = result;
		this.combination = combination;
	}

	void writeln() {
		for (Color color: this.combination.getColors()) {
			new ColorView(color).write();
		}
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}
}
