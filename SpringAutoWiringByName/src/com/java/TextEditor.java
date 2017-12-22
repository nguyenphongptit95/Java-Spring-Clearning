package com.java;

public class TextEditor {
	private SpellChecker spellChecker1;
	private String name;
	public SpellChecker getSpellChecker() {
		return spellChecker1;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker1 = spellChecker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
