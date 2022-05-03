package com.vivek;

public class TextEditor {
	SpellChecker sp;
	public TextEditor(SpellChecker sp) {
		System.out.println("Inside texteditor constructor");
		this.sp=sp;
	}
	public void textSpellCheck() {
		sp.spellCheck();
	}
}
