/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula_constructs.terms;

/**
 *
 * @author logan
 */
public class Term {
    
    private TermNode root;
    private int termLength;
    
    /**
     *
     */
    public Term() {
        //@TODO
    }
    
    /**
     *
     */
    public void insert() {
        //@TODO
    }
    
    /**
     *
     * @return
     */
    public String traverse() {
        return null;
    }
    
    /**
     *
     * @param other
     * @return
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
    		throw new IllegalArgumentException();
    	} else if (other instanceof Term) {
    		Term otherTerm = (Term) other;
    		return this.root.equals(otherTerm.root);
    	} else {
    		return false;
        }
    }  
}
