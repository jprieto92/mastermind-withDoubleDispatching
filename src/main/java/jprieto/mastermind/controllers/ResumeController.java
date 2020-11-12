package jprieto.mastermind.controllers;

import jprieto.mastermind.models.Game;
import jprieto.mastermind.models.State;

public class ResumeController extends UseCaseController {

  ResumeController(Game game, State state) {
    super(game, state);
  }

  public void resume(){
    this.game.reset();
    this.state.reset();
  }
  
  @Override
  public void accept(ControllerVisitor controllerVisitor) {
    controllerVisitor.visit(this);
  }
  
}
