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
public abstract class InferenceSymbol implements Symbol {

    private final String symString;
    private final int arguments;
    private final int weight;
    
    /**
     *
     * @param symString
     * @param arguments
     * @param weight
     */
    protected InferenceSymbol(String symString, int arguments, int weight) {
        this.symString = symString;
        this.arguments = arguments;
        this.weight = weight;
    }
    
    /**
     *
     * @return
     */
    public int getArguments() {
        return this.arguments;
    }
    
    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String getSymString() {
        return this.symString;
    }
    
    
}
