package arbolesbinarios;

public class NodoArbol {
    private int valor;
    private NodoArbol nodoIzq;
    private NodoArbol nodoDer;
    public NodoArbol(int valor){
        this.valor = valor;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }

    public NodoArbol getNodoDer() {
        return nodoDer;
    }
    
    public void insertar(int _valor){
        if(_valor < this.valor){
            //insertar nodo izquierdo
            if(this.nodoIzq == null){
                this.nodoIzq = new NodoArbol(_valor);
            }else{
                this.nodoIzq.insertar(_valor);
            }
        }else{
            //insertar nodo derecho
            if(this.nodoDer == null){
                this.nodoDer = new NodoArbol(_valor);
            }else{
                this.nodoDer.insertar(_valor);
            }
        }
    }
}
