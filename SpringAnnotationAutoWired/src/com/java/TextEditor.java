package com.java;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;

	/**
	 * @return the spellChecker
	 */
	public SpellChecker getSpellChecker1() {
		return spellChecker;
	}

	/**
	 * @param spellChecker the spellChecker to set
	 */
	@Autowired
	public void setSpellChecker1(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
