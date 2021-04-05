package com.sample.testing.models;

public class SampleModelB {

    public SampleModelB(String passwordCombination) {
        this.passwordCombination = passwordCombination;
    }

    public String getPasswordCombination() {
        return passwordCombination;
    }

    public void setPasswordCombination(String passwordCombination) {
        this.passwordCombination = passwordCombination;
    }

    private String passwordCombination;
}
