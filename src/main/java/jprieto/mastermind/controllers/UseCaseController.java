package jprieto.mastermind.controllers;

import jprieto.mastermind.models.Game;
import jprieto.mastermind.models.State;

public abstract class UseCaseController {

	protected Game game;
	protected State state;

	UseCaseController(Game game, State state) {
		this.game = game;
		this.state = state;
	}

	public void next() {
		this.state.next();
	}

	public abstract void accept(ControllerVisitor controllerVisitor);

}
