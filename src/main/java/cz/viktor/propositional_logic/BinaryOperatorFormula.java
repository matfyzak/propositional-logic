package cz.viktor.propositional_logic;

import java.util.Map;

public abstract class BinaryOperatorFormula extends LogicalFormula {
    protected LogicalFormula left;
    protected LogicalFormula right;

    public BinaryOperatorFormula(LogicalFormula left, LogicalFormula right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public abstract boolean evaluate(Map<String, Boolean> model); // Operator evaluation

    @Override
    public abstract String toInfix(); // To print the formula as a string
}
