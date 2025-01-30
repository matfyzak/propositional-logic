package cz.viktor.propositional_logic;

public class Negation implements LogicalOperator {
    @Override
    public boolean apply(boolean[] inputs) {
        return !inputs[0];  // TODO test that the array length is only 1
    }
}