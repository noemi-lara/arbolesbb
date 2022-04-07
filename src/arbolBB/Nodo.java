
package arbolBB;


public class Nodo <T> implements Comparable{
    private T dato;
    private Nodo <T> izq,der;

    public Nodo( T dato, Nodo <T> izq, Nodo <T> der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo <T> getIzq() {
        return izq;
    }

    public void setIzq(Nodo <T> izq) {
        this.izq = izq;
    }

    public Nodo <T> getDer() {
        return der;
    }

    public void setDer(Nodo <T> der) {
        this.der = der;
    }
    
    @Override
    public int compareTo(Object obj) {
        Nodo <T> aux = (Nodo <T>) obj;
        return this.getDato().toString().compareTo(aux.getDato().toString());
    }
 
}
