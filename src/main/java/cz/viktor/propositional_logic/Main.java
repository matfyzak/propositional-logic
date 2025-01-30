package cz.viktor.propositional_logic;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Create some propositions
        LogicalFormula A = new PropositionFormula("A");  // A
        LogicalFormula B = new PropositionFormula("B");  // B
        LogicalFormula C = new PropositionFormula("C");  // C

        // Define a model (truth assignment for the propositions)
        Map<String, Boolean> model = new HashMap<>();
        model.put("A", true);  // A = true
        model.put("B", false); // B = false
        model.put("C", false); // B = false

        // Example formula: (A AND B) OR C
        LogicalFormula F = new ConjunctionFormula(A, B);
        LogicalFormula formula = new DisjunctionFormula(F, C);

        // Evaluate the formula using the model
        System.out.println("Formula: " + formula.toInfix());
        System.out.println("Result: " + formula.evaluate(model));

    }
}
