package org.tahom.repository.model.impl;

import java.util.function.Predicate;

public class Validator {

    private Predicate<String> pr;

    public Validator(Predicate<String> pr) {
        this.pr = pr;
    }

    public boolean validate(String t) {
        return pr.test(t);
    }

}
