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
public abstract class Symbol {

    /**
     *
     */
    protected String symChar;
    
    /**
     *
     * @return
     */
    public abstract int weight();
    
    /**
     *
     * @return
     */
    public String getSymChar() {
        return this.symChar;
    }
    
    public boolean equals(Object other) {
        if (other instanceof Symbol) {
            Symbol otherSym = (Symbol) other;
            return this.symChar.equals(otherSym.symChar);
        } else {
            return false;
        }
    }
    
}
