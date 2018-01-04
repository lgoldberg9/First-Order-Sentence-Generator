/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.logical_mechanics;

import symbols.PredicateSymbol;
import symbols.VariableSymbol;

/**
 *
 * @author logan
 */
public class Predicate implements GenericMechanic {
    
    private final PredicateSymbol predicate;
    private final VariableSymbol var;
    
    public Predicate(PredicateSymbol predicate, VariableSymbol var) {
        this.predicate = predicate;
        this.var = var;
    }
    
    @Override
    public String print() {
        return this.predicate.getSymString() + this.var.getSymString();
    }
    
    public boolean equals(Object other) {
        if (other instanceof Predicate) {
            Predicate otherPred = (Predicate) other;
            return this.predicate.equals(otherPred.predicate) &&
                    this.var.equals(otherPred.var);
        } else {
            return false;
        }
    }
    
}
