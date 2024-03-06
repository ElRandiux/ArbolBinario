package arbolesbinarios;

public class Arbol {
    NodoArbol inicial;
    public Arbol(){
        this.inicial = null;
    }
    public void insertar(int valor){
        if(this.inicial == null){
            this.inicial = new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }
    public void dispararInorden(){
        this.inorden(this.inicial);
    }
    public void inorden(NodoArbol nodo){
        if(nodo == null){
            return; //detener recursividad
        }else{
            inorden(nodo.getNodoIzq());
            System.out.println(nodo.getValor()+", ");
            inorden(nodo.getNodoDer());
        }
    }
}
