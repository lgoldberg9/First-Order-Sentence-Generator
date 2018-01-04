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
public class TermLeafNode implements TermNode {
    
    private final Symbol nodeSymbol;
    
    public TermLeafNode(Symbol nodeSymbol) {
        this.nodeSymbol = nodeSymbol;
    }
    
    @Override
    public TermNode insert() {
        //TODO
        return null;
    }
    
    public Symbol getNodeSymbol() {
        return this.nodeSymbol;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof TermLeafNode) {
            TermLeafNode otherLeaf = (TermLeafNode) other;
            return this.nodeSymbol.equals(otherLeaf.getNodeSymbol());
        } else {
            return false;
        }
    }
}
