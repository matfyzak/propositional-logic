package cz.viktor.propositional_logic;

import java.util.Map;

public class NegationFormula extends UnaryOperatorFormula {
    static LogicalOperator negation = new Negation();

    public NegationFormula(LogicalFormula formula) {
        super(formula);
    }

    @Override
    public boolean evaluate(Map<String, Boolean> model){
        return negation.apply(new boolean[] {formula.evaluate(model)});
    }

    @Override
    public String toInfix(){
        return "(¬" + formula.toInfix() + ")";
    }
}

