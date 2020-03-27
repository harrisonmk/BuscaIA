package estruturas;

import grafocidades.Cidade;
import javax.swing.JOptionPane;

public class Pilha {

    private int tamanho; //tamanho da pilha
    private Cidade[] cidades;
    private int topo;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        cidades = new Cidade[this.tamanho];
        topo = -1;
    }

    public void empilhar(Cidade cidade) {

        if (!pilhaCheia()) {

            cidades[++topo] = cidade;

        } else {

            JOptionPane.showMessageDialog(null, "Pilha Cheia", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public Cidade desempilhar() {

        if (!pilhaVazia()) {
            return cidades[topo--];
        } else {
            JOptionPane.showMessageDialog(null, "Pilha ja esta Vazia", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }

    }

    public Cidade getTopo() {

        return cidades[topo];

    }

    public boolean pilhaVazia() {

        return (topo == -1);

    }

    public boolean pilhaCheia() {

        return (topo == tamanho - 1);

    }

}
