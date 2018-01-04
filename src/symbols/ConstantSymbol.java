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
public class ConstantSymbol extends FixedSymbol implements LanguageSymbol {
    
    public ConstantSymbol(String symString) {
        super(symString);
    }
    
    /**
     *
     */
    public static final ConstantSymbol ZERO = new ConstantSymbol("0");
    
    /**
     *
     */
    public static final ConstantSymbol ONE = new ConstantSymbol("1");
    
}
