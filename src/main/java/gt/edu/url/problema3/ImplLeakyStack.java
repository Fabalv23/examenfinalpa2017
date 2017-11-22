/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author fabia
 * @param <E>
 */
public class ImplLeakyStack<E> implements LeakyStack {

    
    CircularLinkedList<E> aux = new CircularLinkedList();
    
    /**
     * Constructor con tamanio fijo
     * @param i 
     */
    public ImplLeakyStack(int i) {
        
        size = i;
        
    }
    
    int size =0;
            int cont = 0;
            int cont1 = 0;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
       return size==0;
    }

    /**
     * Devuelve el ultimo que ingreso
     * @param e
     * @return 
     */
    @Override
    public Object saveHistory(Object e) {
       
       if (cont == size) {
            return null;
        }else{
             aux.addLast((E)e);
             cont++;
        return aux.last();
        }
              
    }

    /**
     * Devuelve el objeto actual a manejar
     * @return 
     */
    @Override
    public Object actual() {
        if (!isEmpty()) {
            System.out.println("Vacia");
            return null;
        }else{
            return aux.last();
        }
            
    }

    @Override
    public Object undo() {
        if (cont1 == size) {
           // throw  IllegalArgumentException;
            return null;
        }else{
              return aux.removeLast();
        }
        
    }
    
    
    
}
