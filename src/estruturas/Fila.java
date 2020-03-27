package estruturas;

import grafocidades.Cidade;
import javax.swing.JOptionPane;

public class Fila {

    private int tamanho;
    private Cidade[] cidades;
    private int inicio;
    private int fim;
    private int numeroElementos;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        cidades = new Cidade[tamanho];
        inicio = 0;
        fim = -1;
        numeroElementos = 0;

    }

    public void enfileirar(Cidade cidade) {

        if (!filaCheia()) {

            if (fim == tamanho - 1) {

                fim = -1;
            }
            cidades[++fim] = cidade;
            numeroElementos++;

        } else {

            JOptionPane.showMessageDialog(null, "A Fila ja esta cheia ", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public Cidade desenfileirar() {

        if (!filaVazia()) {

            Cidade temp = cidades[inicio++];

            if (inicio == tamanho) {
                inicio = 0;
            }

            numeroElementos--;
            return temp;

        } else {
            JOptionPane.showMessageDialog(null, "A Fila ja esta vazia ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }

    }

    public Cidade getPrimeiro() {

        return cidades[inicio];

    }

    public boolean filaVazia() {

        return (numeroElementos == 0);
    }

    public boolean filaCheia() {

        return (numeroElementos == tamanho);

    }

    public int getNumeroElementos() {
        return numeroElementos;
    }
    
    
    

}
