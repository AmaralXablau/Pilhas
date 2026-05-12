public class Pilha {

     int[] pilha;
     int topo;

    public Pilha(int tam){

        topo = -1;
        pilha = new int[tam];

    }


    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia (){
        return topo == pilha.length -1;
    }

    public boolean push (int valor){
        if (cheia()) {
            return false;
        }
        topo++;
        pilha[topo] = valor;
        return true;
    }

    public boolean pop (){
        if(cheia()) return false;
        int valor = pilha[topo];
        topo--;
        return true;
    }

    public boolean top (int valor){
        if(cheia()) return false;
        valor = pilha[topo];
        return true;
    }

    public void imprimir (){
        for (int i = topo; i >= 0 ; i--) {
            System.out.print(pilha[i] + ", ");
        }
        System.out.println();
    }

    public void invertido (){
        for (int i = 0; i <= topo ; i++) {
            System.out.print(pilha[i]+ ", ");
        }
        System.out.println();
    }
}
