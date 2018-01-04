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
public class UnaryPropositionSymbol extends PropositionSymbol {
     
    /**
     *
     * @param symChar
     */
    public UnaryPropositionSymbol(String symChar) {
        super(symChar);
    }
    
    @Override
    public int weight() {
        return 0;
    }
    
    /**
     *
     */
    public static final UnaryPropositionSymbol NOT = new UnaryPropositionSymbol(FormulaConstants.NOT_SYMBOL);
    
}
