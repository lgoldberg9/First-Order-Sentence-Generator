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
public class Variable extends Symbol {

    public Variable(String symChar) {
        this.symChar = symChar;
    } 
    
    @Override
    public int weight() {
        return -1;
    }
    
}
