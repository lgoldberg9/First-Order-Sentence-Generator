/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.terms;
import symbols.*;

/**
 *
 * @author logan
 */
public interface TermNode {
    
    /**
     *
     * @return
     */
    public TermNode insert();
    
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
    public boolean equals(Object node);
    
}
