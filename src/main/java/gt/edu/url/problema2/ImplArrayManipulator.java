/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

/**
 *
 * @author fabia
 */


/**
 * Implementacion para que retorne los cambios
 * @author fabia
 * @param <E> 
 */
public class ImplArrayManipulator<E> implements ArrayManipulator {

    @Override
    public int subsets(List set) {
       set.generate(6, set);
      
       return set.size();
    
    }
    
    
    
    
    
    
    
}
