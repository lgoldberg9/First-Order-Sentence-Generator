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
public class VariableSymbol extends FixedSymbol {
    
    public VariableSymbol(String symString) {
        super(symString);
    }
    
    /**
     *
     */
    public static final VariableSymbol X_1 = new VariableSymbol("X_1");
    
}
