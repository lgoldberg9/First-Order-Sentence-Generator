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
public class RelationSymbol extends TupleLanguageSymbol {
    
    public RelationSymbol(String relationSym, int arity) {
        super(relationSym, arity);
    }
    
    /**
     *
     */
    public static final RelationSymbol EQUALS = new RelationSymbol("=", 2);
    
}