package pilhajava;

public class Pilha<T> {
    private T[] elementos;
    private int topo;
    
    public Pilha(int tamanho){
        this.elementos = (T[]) new Object[tamanho];
        this.topo = -1;
    }
    public boolean isEmpty(){
        return this.topo == -1;
    }
    
    public boolean isFull(){
        return this.topo == this.elementos.length -1;
    }
    public boolean push(T dado){
        if(!this.isFull()){
            this.topo++;
            this.elementos[this.topo] = dado;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
      StringBuilder retorno = new StringBuilder("topo\n");
      for(int i = this.topo; i > 0; i--){
          retorno.append(this.elementos[i]+"\n");
      }
      return retorno.toString();
    }

    String pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

