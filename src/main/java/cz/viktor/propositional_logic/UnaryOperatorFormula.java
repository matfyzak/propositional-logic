package cz.viktor.propositional_logic;

import java.util.Map;

public abstract class UnaryOperatorFormula extends LogicalFormula {
    protected LogicalFormula formula;

    public UnaryOperatorFormula(LogicalFormula formula) {
        this.formula = formula;
    }

    @Override
    public abstract boolean evaluate(Map<String, Boolean> model); // Operator evaluation

    @Override
    public abstract String toInfix(); // To print the formula as a string
}
