//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("yaya!");

        Pilha pilha = new Pilha(50);

        pilha.push(7);
        pilha.push(88);
        pilha.push(52);
        pilha.pop();

        pilha.imprimir();
        pilha.invertido();

    }
}