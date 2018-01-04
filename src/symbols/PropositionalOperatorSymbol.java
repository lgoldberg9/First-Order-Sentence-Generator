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
public class PropositionalOperatorSymbol extends InferenceSymbol {
    
    /**
     *
     * @param symString
     * @param arguments
     * @param weight
     */
    public PropositionalOperatorSymbol(String symString, int arguments, int weight) {
        super(symString, arguments, weight);
    }
    
    /**
     *
     */
    public static final PropositionalOperatorSymbol NOT = new PropositionalOperatorSymbol(FormulaConstants.NOT_SYMBOL, 1, 0);
    
    /**
     *
     */
    public static final PropositionalOperatorSymbol AND = new PropositionalOperatorSymbol(FormulaConstants.AND_SYMBOL, 2, -1);

    /**
     *
     */
    public static final PropositionalOperatorSymbol OR = new PropositionalOperatorSymbol(FormulaConstants.OR_SYMBOL, 2, -1);

    /**
     *
     */
    public static final PropositionalOperatorSymbol IMPLICATION = new PropositionalOperatorSymbol(FormulaConstants.IMPLICATION_SYMBOL, 2, -1);
    
    
}
