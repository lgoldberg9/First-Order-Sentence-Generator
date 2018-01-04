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
public abstract class FixedSymbol implements Symbol {

    private final String symString;
    private final int weight;
    
    protected FixedSymbol(String symString) {
        this.symString = symString;
        this.weight = 1;
    }
    
    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String getSymString() {
        return this.symString;
    }
    
    @Override
    public boolean equals(Object other) {
        return false;
    }
    
}
