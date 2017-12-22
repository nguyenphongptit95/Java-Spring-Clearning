package com.java;

public class TextEditor {
	private String name;
	private SpellChecker sc1;
	private SpellChecker sc2;
	public TextEditor(String name, SpellChecker sc1) {
		super();
		this.name = name;
		this.sc1 = sc1;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sc1
	 */
	public SpellChecker getSc1() {
		return sc1;
	}
	/**
	 * @param sc1 the sc1 to set
	 */
	public void setSc1(SpellChecker sc1) {
		this.sc1 = sc1;
	}
	/**
	 * @return the sc2
	 */
	public SpellChecker getSc2() {
		return sc2;
	}
	/**
	 * @param sc2 the sc2 to set
	 */
	public void setSc2(SpellChecker sc2) {
		this.sc2 = sc2;
	}
	
}
