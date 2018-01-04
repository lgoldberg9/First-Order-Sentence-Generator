/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.logical_mechanics;

import symbols.Symbol;

/**
 *
 * @author logan
 */
public interface PropositionNode {
    
    /**
     *
     * @return
     */
    public PropositionNode insert();
    
    /**
     *
     * @return
     */
    public Symbol getNodeSymbol();
    
    /**
     *
     * @param node
     * @return
     */
    @Override
    public boolean equals(Object node);
    
}
