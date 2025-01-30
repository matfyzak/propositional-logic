package cz.viktor.propositional_logic;

import java.util.Map;

public abstract class LogicalFormula {
    public abstract boolean evaluate(Map<String, Boolean> model);

    public abstract String toInfix();
}
