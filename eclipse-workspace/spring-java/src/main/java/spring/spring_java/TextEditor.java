package spring.spring_java;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor( SpellChecker spellChecker) {
		System.out.println("inside Text editor");
		this.spellChecker=spellChecker;
		
	}
	public TextEditor() {
		
	}
	
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
		
	}

}
