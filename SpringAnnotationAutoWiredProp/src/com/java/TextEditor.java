package com.java;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;
	public TextEditor() {
		System.out.println("Inside TextEditor contructor.");
	}
//	/**
//	 * @return the spellChecker
//	 */
//	public SpellChecker getSpellChecker() {
//		return spellChecker;
//	}
//	/**
//	 * @param spellChecker the spellChecker to set
//	 */
//	public void setSpellChecker(SpellChecker spellChecker) {
//		this.spellChecker = spellChecker;
//	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
