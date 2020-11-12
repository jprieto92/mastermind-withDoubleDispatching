package jprieto.mastermind.models;

import java.util.List;

import jprieto.mastermind.views.console.ColorView;

public class ProposedCombination extends Combination {

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	public List<Color> getColors() {
		return this.colors;
	}
	
	public Error setCombination(String characters)
	{
		if (characters.length() > Combination.getWidth()) {
			return Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < characters.length(); i++) {
				Color color = ColorView.getInstance(characters.charAt(i));
				if (color == null) {
					return Error.WRONG_CHARACTERS;
				} else {
					if (this.getColors().contains(color)) {
						return Error.DUPLICATED;
					} else {
						this.getColors().add(color);
					}
				}
			}
		}
		return Error.NULL;
	}

}
