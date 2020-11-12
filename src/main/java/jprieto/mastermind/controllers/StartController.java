package jprieto.mastermind.controllers;

import jprieto.mastermind.models.Game;
import jprieto.mastermind.models.State;

public class StartController extends UseCaseController {

  public StartController(Game game, State state) {
    super(game, state);
  }

  public void setUser() {
    this.game.setUser();
    this.state.next();
  }

  @Override
  public void accept(ControllerVisitor controllerVisitor) {
    controllerVisitor.visit(this);
  }

}
