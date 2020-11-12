package jprieto.utils;

public class YesNoDialog{

	private static final char AFIRMATIVE = 'y';

	private static final char NEGATIVE = 'n';
	
	private static final String QUESTION = "? ("+YesNoDialog.AFIRMATIVE+"/"+YesNoDialog.NEGATIVE+"): ";

	private static final String MESSAGE = "The value must be '" + YesNoDialog.AFIRMATIVE + "' or '"
			+ YesNoDialog.NEGATIVE + "'";
	private char answer;


	public boolean read(String title) {
		assert title != null;
		Console console = Console.instance();
		boolean ok;
		do {
			this.answer = console.readChar(title + YesNoDialog.QUESTION);
			ok = YesNoDialog.isAfirmative(this.answer) || YesNoDialog.isNegative(this.answer);
			if (!ok) {
				console.writeln(YesNoDialog.MESSAGE);
			}
		} while (!ok);
		return YesNoDialog.isAfirmative(this.answer);
	}

	public boolean read() {
		return this.read("");
	}

	private static boolean isAfirmative(char answer) {
		return Character.toLowerCase(answer) == YesNoDialog.AFIRMATIVE;
	}

	private static boolean isNegative(char answer) {
		return Character.toLowerCase(answer) == YesNoDialog.NEGATIVE;
	}

}
