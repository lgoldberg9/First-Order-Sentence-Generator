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
public class FunctionSymbol extends TupleLanguageSymbol implements TermSymbol {

    public FunctionSymbol(String relationSym, int arity) {
        super(relationSym, arity);
    }
    
    /**
     *
     */
    public static final FunctionSymbol ADD = new FunctionSymbol("+", 2);
    
    /**
     *
     */
    public static final FunctionSymbol MULTIPLY = new FunctionSymbol("*", 2);
    
}
