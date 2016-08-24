package com.tdd.bean;

/**
 * Created by Administrator on 2016/8/24.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("inside TextEditor constructor");
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpeclling();
    }
}
