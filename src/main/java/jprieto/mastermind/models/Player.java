package jprieto.mastermind.models;

public class Player {

	private Board board;

	Player(Board board) {
		assert board != null;

		this.board = board;
	}

	void addProposedCombination(ProposedCombination proposedCombination) {
		this.board.addProposedCombination(proposedCombination);
	}

}
