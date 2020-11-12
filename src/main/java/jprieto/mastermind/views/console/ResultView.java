package jprieto.mastermind.views.console;

import jprieto.mastermind.models.Color;
import jprieto.mastermind.models.ProposedCombination;
import jprieto.mastermind.models.Result;
import jprieto.mastermind.views.MessageView;

public class ResultView {

	void writeln(ProposedCombination combination, Result result) {
		for (Color color: combination.getColors()) {
			new ColorView(color).write();
		}
		MessageView.RESULT.writeln(result.getBlacks(), result.getWhites());
	}
}
