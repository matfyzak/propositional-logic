package cz.viktor.propositional_logic;

import java.util.Map;

public class DisjunctionFormula extends BinaryOperatorFormula {
    static LogicalOperator disjunction = new Disjunction();

    public DisjunctionFormula(LogicalFormula left, LogicalFormula right) {
        super(left, right);
    }

    @Override
    public boolean evaluate(Map<String, Boolean> model){
        return disjunction.apply(new boolean[] {left.evaluate(model), right.evaluate(model)});
    }

    @Override
    public String toInfix(){
        return "(" + left.toInfix() + " ∨ " + right.toInfix() + ")";
    }
}
