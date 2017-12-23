package com.java;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;
	private SpellChecker spellChecker2;
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		super();
		System.out.println("Inside TextEditor contructor.");
		this.spellChecker = spellChecker;
	}
	
	
	
	/**
	 * @return the spellChecker
	 */
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}



	/**
	 * @param spellChecker the spellChecker to set
	 */
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}



	/**
	 * @return the spellChecker2
	 */
	public SpellChecker getSpellChecker2() {
		return spellChecker2;
	}



	/**
	 * @param spellChecker2 the spellChecker2 to set
	 */
	public void setSpellChecker2(SpellChecker spellChecker2) {
		this.spellChecker2 = spellChecker2;
	}



	public void checkSpelling() {
		System.out.println("Inside checkSpelling.");
	}
}
