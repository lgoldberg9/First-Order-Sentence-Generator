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
public abstract class TupleLanguageSymbol implements LanguageSymbol {
    
    private final String symString;
    private final int arity;
    private final int weight;
    
    public TupleLanguageSymbol(String relationSym, int arity) {
        this.symString = relationSym;
        this.arity = arity;
        this.weight = 1 - arity;
    }
    
    public int getArity() {
        return this.arity;
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
