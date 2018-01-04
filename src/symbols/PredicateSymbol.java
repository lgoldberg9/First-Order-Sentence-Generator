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
public class PredicateSymbol extends InferenceSymbol {

    /**
     *
     * @param symString
     * @param arguments
     * @param weight
     */
    public PredicateSymbol(String symString, int arguments, int weight) {
        super(symString, arguments, weight);
    }

    /**
     *
     */
    public static final PredicateSymbol UNIVERSAL = new PredicateSymbol(FormulaConstants.UNIVERSAL_QUANTIFIER_SYMBOL, 0, -1);
    
    /**
     *
     */
    public static final PredicateSymbol EXISTENTIAL = new PredicateSymbol(FormulaConstants.EXISTENTIAL_QUANTIFIER_SYMBOL, 0, -1);
    
}
