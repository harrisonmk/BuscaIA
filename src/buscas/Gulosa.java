package buscas;

import estruturas.VetorOrdenado;
import grafocidades.Adjacente;
import grafocidades.Cidade;

public class Gulosa {

    private VetorOrdenado fronteira;
    private Cidade objetivo;
    private boolean achou; //para indicar se ja achou o destino

    public Gulosa(Cidade objetivo) {

        this.objetivo = objetivo;
        achou = false;

    }

    public void buscar(Cidade atual) {

        System.out.println("\nAtual: " + atual.getNome());
        atual.setVisitado(true);

        if (atual == objetivo) {

            achou = true;

        } else {

            fronteira = new VetorOrdenado(atual.getAdjacentes().size());

            for (Adjacente a : atual.getAdjacentes()) {

                if (!a.getCidade().isVisitado()) {

                    a.getCidade().setVisitado(true);
                    fronteira.inserir(a.getCidade());

                }

            }

            fronteira.mostrar();
            if (fronteira.getPrimeiro() != null) {
                buscar(fronteira.getPrimeiro());
            }

        }

    }

}
