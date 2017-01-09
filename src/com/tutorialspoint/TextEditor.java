package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shashank on 27/3/16.
 */
public class TextEditor {
    private SpellChecker spellChecker;


    // a setter method to inject the dependency.
    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
