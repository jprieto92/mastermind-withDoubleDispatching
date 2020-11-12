package jprieto.mastermind.views.console;

import jprieto.mastermind.controllers.PlayController;
import jprieto.mastermind.models.ProposedCombination;
import jprieto.mastermind.views.MessageView;

class PlayView {

    void interact(PlayController playController) {
    		this.proposeCombination(playController);
    	    MessageView.ATTEMPTS.writeln(playController.getAttemps());
    	    new SecretCombinationView().writeln();
    		for (int i = 0; i < playController.getAttemps(); i++) {
    			new ResultView().writeln(playController.getProposedCombination(i), playController.getResult(i));
    		}
    		if (playController.isMasterMind()){
                MessageView.WINNER.writeln();
            }else if(playController.isMaxAttempsReached())
            {
            	MessageView.LOOSER.writeln();
            }	
    }
    
    private void proposeCombination(PlayController playController) {
        ProposedCombination combination = new ProposedCombination();
        combination = new ProposedCombinationView().read();
        playController.proposeCombination(combination);
    }

}