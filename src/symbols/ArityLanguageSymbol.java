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
public abstract class ArityLanguageSymbol extends Symbol implements LanguageSymbol {

    private int arity;
    private String symChar;
    
    public ArityLanguageSymbol(String symChar, int letter) {
        this.arity = arity;
        this.symChar = symChar;
    }
    
    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public int weight() {
        return 1 - this.arity;
    }
    
}
