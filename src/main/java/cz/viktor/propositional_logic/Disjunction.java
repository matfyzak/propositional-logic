package cz.viktor.propositional_logic;

public class Disjunction implements LogicalOperator {
    @Override
    public boolean apply(boolean[] inputs) {
        for (boolean input : inputs) {
            if (input) {
                return true;
            }
        }
        return false;
    }
}