package jprieto.mastermind;

import jprieto.mastermind.views.graphics.GraphicView;

public class GraphicsMasterMind extends MasterMind {
	
	@Override
	protected GraphicView createView(){
		return new GraphicView();
	}

	public static void main(String[] args) {
		new GraphicsMasterMind().play();
	}

}