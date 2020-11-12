package jprieto.mastermind.views;

import jprieto.mastermind.controllers.ControllerVisitor;
import jprieto.mastermind.controllers.UseCaseController;

public abstract class View implements ControllerVisitor{

	public abstract void interact(UseCaseController controller);

}