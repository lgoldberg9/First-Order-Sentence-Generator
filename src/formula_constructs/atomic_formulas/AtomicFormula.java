/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.atomic_formulas;

import formula_constructs.terms.Term;
import java.util.ArrayList;
import symbols.Relation;

/**
 *
 * @author logan
 */
public class AtomicFormula {
    
    private final Relation atomicRoot;
    private final ArrayList<Term> arguments;
    
    /**
     *
     * @param rel
     */
    public AtomicFormula(Relation rel /* stuff */) {
        this.atomicRoot = rel;
        this.arguments = new ArrayList<>(rel.getArity());
    }
    
    /**
     *
     */
    public void insert() {
        
    }
    
    /**
     *
     * @param other
     * @return
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof AtomicFormula) {
            AtomicFormula otherForm = (AtomicFormula) other;
            // To protect against an index out of bounds error
            if (this.arguments.size() == otherForm.arguments.size()) {
                boolean areEqualFormula = this.atomicRoot.equals(otherForm.atomicRoot);
                for (int index = 0; index < this.arguments.size(); index++) {
                    areEqualFormula = areEqualFormula && this.arguments.get(index).equals(otherForm.arguments.get(index));
                }
                return areEqualFormula;
            }
        }
        return false;
    }
}
