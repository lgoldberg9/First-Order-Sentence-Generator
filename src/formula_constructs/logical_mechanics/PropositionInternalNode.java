/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.logical_mechanics;

import symbols.Symbol;
import symbols.PropositionalOperatorSymbol;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author logan
 */
public class PropositionInternalNode implements PropositionNode {

    private final PropositionalOperatorSymbol proposition;
    private final ArrayList<PropositionNode> branches;
    
    public PropositionInternalNode(PropositionalOperatorSymbol prop /* stuff */) {
        this.proposition = prop;
        this.branches = new ArrayList<>(prop.getArguments());
    }
    
    public String print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PropositionNode insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Symbol getNodeSymbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean equals(Object node) {
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.proposition);
        hash = 41 * hash + Objects.hashCode(this.branches);
        return hash;
    }
}
