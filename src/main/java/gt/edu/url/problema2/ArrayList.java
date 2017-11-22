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
 * Implementacion de la arraylist
 * @author fabia
 * @param <E> 
 */
public class ArrayList<E> implements List<E> {
	
	public static final int CAPACITY=16;
	private E[ ] data;
	private int size = 0;
	
	public ArrayList() {
		this(CAPACITY);
	}

	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() { 
		return size == 0;
	}

	public E get(int i) {
		checkIndex(i, size);
		return data[i];
	}

	public E set(int i, E e) {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}
        
        

	public void add(int i, E e) {
		checkIndex(i, size + 1);
		if (size == data.length) // not enough capacity
			throw new IllegalStateException("Array is full");
		for (int k=size-1; k >= i; k--) // start by shifting rightmost
			data[k+1] = data[k];
		data[i] = e; // ready to place the new element size++;
		
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k=i; k < size-1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
	}
	
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
		throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
        
        
        
        /**
         * Metodo Swap que permite el cambio de posiciones
         * @param i
         * @param q 
         */
        public void swap(int i, E q) {
        
     E temp = null;     //obtendra el valor a cambiar en el segundo             
      temp= set(i,q);      //Establece el el valor obtenido en temp
      set((Integer)q,temp);      //poner en la segunda posicion el valor temp
             
    }
                
        /**
         * Algoritmo de Heap, permite hacer permutaciones entre los arreglos
         * @param n
         * @param e 
         */
        public void generate(int n, List e){
    if( n == 1 ){
    	 for (int i=0;i<5;i++){
    	         System.out.println(e.remove(i));       //Lo imprime como debe ser, cada permitacion que desea
    	        }
    	 System.out.println("");

    }else{
        for (int i=0;i<n-1;i++){
            generate(n - 1, e);
            if (n%2==0){
                
                swap((Integer)e.get(i), (E) e.get(n-1));
            } else{
                swap((Integer)e.get(0), (E) e.get(n-1));
            }
        }
        generate(n - 1, e);
    }
    
    
        }



}