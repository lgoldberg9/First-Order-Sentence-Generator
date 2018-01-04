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
public class Constant extends Symbol implements LanguageSymbol {
    
    public Constant(String symChar) {
        this.symChar = symChar;
    }
    
    @Override
    public int getArity() {
        return 0;
    }

    @Override
    public int weight() {
        return 1;
    }
    
}
