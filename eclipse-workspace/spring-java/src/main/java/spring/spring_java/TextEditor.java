package spring.spring_java;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;
	@Autowired
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
