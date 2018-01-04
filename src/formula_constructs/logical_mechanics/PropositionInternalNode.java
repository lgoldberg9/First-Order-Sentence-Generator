/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.logical_mechanics;

import formula_constructs.atomic_formulas.AtomicFormula;
import java.util.ArrayList;
import symbols.*;

/**
 *
 * @author logan
 */
public class PropositionInternalNode implements PropositionNode {

    private PropositionSymbol proposition;
    private ArrayList<PropositionNode> branches;
    
    public PropositionInternalNode(PropositionSymbol prop /* stuff */) {
        this.proposition = prop;
        this.branches = new ArrayList<PropositionNode>();
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
}
