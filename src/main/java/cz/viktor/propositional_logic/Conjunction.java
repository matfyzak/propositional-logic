package cz.viktor.propositional_logic;

public class Conjunction implements LogicalOperator {
    @Override
    public boolean apply(boolean[] inputs) {
        for (boolean input : inputs) {
            if (!input) {
                return false;
            }
        }
        return true;
    }
}