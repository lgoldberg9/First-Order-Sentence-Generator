/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symbols;

/**
 *
 * @author logan
 */
public class PredicateSymbol extends Symbol {

    public PredicateSymbol(String symChar) {
        this.symChar = symChar;
    }
    
    @Override
    public int weight() {
        return -1;
    }
    
    /**
     *
     */
    public static final PredicateSymbol UNIVERSAL = new PredicateSymbol(FormulaConstants.UNIVERSAL_QUANTIFIER_SYMBOL);
    
    /**
     *
     */
    public static final PredicateSymbol EXISTENTIAL = new PredicateSymbol(FormulaConstants.EXISTENTIAL_QUANTIFIER_SYMBOL);
    
}
