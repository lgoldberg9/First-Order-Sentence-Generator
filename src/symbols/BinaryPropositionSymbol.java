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
public class BinaryPropositionSymbol extends PropositionSymbol {
    
    public BinaryPropositionSymbol(String symChar) {
        super(symChar);
    }
    
    @Override
    public int weight() {
        return -1;
    }
    
    /**
     *
     */
    public static final BinaryPropositionSymbol AND = new BinaryPropositionSymbol(FormulaConstants.AND_SYMBOL);

    /**
     *
     */
    public static final BinaryPropositionSymbol OR = new BinaryPropositionSymbol(FormulaConstants.OR_SYMBOL);

    /**
     *
     */
    public static final BinaryPropositionSymbol IMPLICATION = new BinaryPropositionSymbol(FormulaConstants.IMPLICATION_SYMBOL);
    
}
