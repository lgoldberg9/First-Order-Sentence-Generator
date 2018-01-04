/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.logical_mechanics;

import formula_constructs.atomic_formulas.AtomicFormula;
import java.util.ArrayList;
import symbols.PropositionSymbol;
import symbols.Symbol;

/**
 *
 * @author logan
 */
public class PropositionLeafNode implements PropositionNode {

    private AtomicFormula form; 
    
    public PropositionLeafNode() {
        
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
