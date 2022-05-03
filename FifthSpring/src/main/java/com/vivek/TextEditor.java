package com.vivek;

public class TextEditor {
	SpellChecker chk;

	public SpellChecker getChk() {
		return chk;
	}

	public void setChk(SpellChecker chk) {
		System.out.println("chk initialised");
		this.chk = chk;
	}
	
	public void getSpellCheck() {
		chk.spellCheck();
	}
}
