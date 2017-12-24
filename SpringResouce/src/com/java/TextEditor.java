package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;

public class TextEditor {
	private SpellChecker spellChecker;

	/**
	 * @return the spellChecker
	 */
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	/**
	 * @param spellChecker the spellChecker to set
	 */
	@Resource (name = "spellChecker")
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
}
