package cz.viktor.propositional_logic;

import java.util.Map;

public class ConjunctionFormula extends BinaryOperatorFormula {
    static LogicalOperator conjunction = new Conjunction();

    public ConjunctionFormula(LogicalFormula left, LogicalFormula right) {
        super(left, right);
    }

    @Override
    public boolean evaluate(Map<String, Boolean> model){
        return conjunction.apply(new boolean[] {left.evaluate( model), right.evaluate(model)});
    }

    @Override
    public String toInfix(){
        return "(" + left.toInfix() + " ∧ " + right.toInfix() + ")";
    }
}
