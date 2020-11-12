package jprieto.mastermind.models;

public class Turn {

	private Player player;
	private Board board;

	Turn(Board board) {
		assert board != null;

		this.board = board;
	}

	void setUser() {
		this.board.reset();
		this.player = new Player(board);
	}

	void addProposedCombination(ProposedCombination proposedCombination) {
		this.getPlayer().addProposedCombination(proposedCombination);
	}

	private Player getPlayer() {
		return this.player;
	}


}