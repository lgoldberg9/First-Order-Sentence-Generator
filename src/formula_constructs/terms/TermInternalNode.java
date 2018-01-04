/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.terms;

import static java.lang.Double.min;
import java.util.ArrayList;
import symbols.*;

/**
 *
 * @author logan
 */
public class TermInternalNode implements TermNode {

    private final Function nodeSymbol;
    private final ArrayList<TermNode> branches;
    
    /**
     *
     * @param func
     */
    public TermInternalNode(Function func /* stuff */) {
        this.nodeSymbol = func;
        this.branches = new ArrayList<>(func.getArity());
    }
    
    @Override
    public TermNode insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Symbol getNodeSymbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof TermInternalNode) {
            TermInternalNode otherInternal = (TermInternalNode) other;
            // To protect against an index out of bounds error
            if (this.branches.size() == otherInternal.branches.size()) {
                boolean areEqualSubtrees = this.nodeSymbol.equals(otherInternal.nodeSymbol);
                for (int index = 0; index < this.branches.size(); index++) {
                    areEqualSubtrees = areEqualSubtrees && this.branches.get(index).equals(otherInternal.branches.get(index));
                }
                return areEqualSubtrees;
            }
        } 
        return false;
    }
    
}
