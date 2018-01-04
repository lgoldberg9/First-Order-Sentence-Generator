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
public class Relation extends ArityLanguageSymbol {
    
    public Relation(String symChar, int arity) {
        super(symChar, arity);
    }
    
    public static final Relation EQUALITY = new Relation("=", 2);
    
}
