package jprieto.mastermind.models;

public class Game {
    
    private Board board;
    private Turn turn;
    
    public Game() {
        this.reset();
    }
    
    public void reset() {
        this.board = new Board();
	}
    
    public void setUser() {
        this.turn = new Turn(this.board);
		this.turn.setUser();
    }

    public boolean isMaxAttempsReached() {
        return this.board.isLooser();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.turn.addProposedCombination(proposedCombination);
    }

    public boolean isMasterMind() {
        return this.board.isWinner();
    }

    public int getAttemps()
    {
    	return this.board.getAttempts();
    }
    
    public Result getResult(int position)
    {
    	return this.board.getResult(position);
    }
    
    public ProposedCombination getProposedCombination(int position)
    {
    	return this.board.getProposedCombination(position);
    }

}