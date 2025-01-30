package cz.viktor.propositional_logic;

import java.util.Map;

public class PropositionFormula extends LogicalFormula {
    private final String name;

    public PropositionFormula(String name) {
        this.name = name;
    }

    @Override
    public boolean evaluate(Map<String, Boolean> model) {
        Boolean value = model.get(name);
        if (value == null) {
            throw new IllegalArgumentException("Proposition " + name + " is not assigned in the model.");
        }
        return value;
    }

    @Override
    public String toInfix() {
        return name;
    }
}