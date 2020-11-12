package jprieto.mastermind.controllers;

import jprieto.mastermind.models.Game;
import jprieto.mastermind.models.ProposedCombination;
import jprieto.mastermind.models.Result;
import jprieto.mastermind.models.State;

public class PlayController extends UseCaseController {

	public PlayController(Game game, State state) {
		super(game, state);
	}

	public boolean isMaxAttempsReached() {
		return this.game.isMaxAttempsReached();
	}

	public boolean isMasterMind() {
		return this.game.isMasterMind();
	}
	
	public int getAttemps() {
		return this.game.getAttemps();
	}
	
	public Result getResult(int position)
	{
		return this.game.getResult(position);
	}
	
	public ProposedCombination getProposedCombination(int position)
	{
		return this.game.getProposedCombination(position);
	}
	
	public void proposeCombination(ProposedCombination combination) {
		this.game.addProposedCombination(combination);
		if (this.game.isMasterMind() || this.game.isMaxAttempsReached()) {
			this.state.next();
		}
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}
