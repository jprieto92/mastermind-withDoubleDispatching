package jprieto.mastermind;

import jprieto.mastermind.views.graphics.View;

public class GraphicsMasterMind extends MasterMind {
	
	@Override
	protected View createView(){
		return new View();
	}

	public static void main(String[] args) {
		new GraphicsMasterMind().play();
	}

}