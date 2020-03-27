package buscas;

import estruturas.VetorOrdenadoAdjacente;
import grafocidades.Adjacente;
import grafocidades.Cidade;

public class AEstrela {

    private VetorOrdenadoAdjacente fronteira;
    private Cidade objetivo;
    private boolean achou;

    public AEstrela(Cidade objetivo) {

        this.objetivo = objetivo;
        achou = false;

    }

    public void buscar(Cidade atual) {

        System.out.println("\ntual: " + atual.getNome());
        atual.setVisitado(true);

        if (atual == objetivo) {

            achou = true;
        } else {

            fronteira = new VetorOrdenadoAdjacente(atual.getAdjacentes().size());
            for (Adjacente a : atual.getAdjacentes()) {

                if (!a.getCidade().isVisitado()) {

                    a.getCidade().setVisitado(true);
                    fronteira.inserir(a);

                }

            }

            fronteira.mostrar();
            buscar(fronteira.getPrimeiro());

        }

    }

}
