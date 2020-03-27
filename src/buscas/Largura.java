package buscas;

import estruturas.Fila;
import grafocidades.Adjacente;
import grafocidades.Cidade;

public class Largura {

    private Fila fronteira;
    private Cidade inicio;
    private Cidade objetivo;
    private boolean achou;

    public Largura(Cidade inicio, Cidade objetivo) {
        this.inicio = inicio;
        this.inicio.setVisitado(true);
        this.objetivo = objetivo;

        fronteira = new Fila(20);
        fronteira.enfileirar(inicio);
        achou = false;

    }

    public void buscar() {

        Cidade primeiro = fronteira.getPrimeiro();
        System.out.println("Primeiro: " + primeiro.getNome());

        if (primeiro == objetivo) {

            achou = true;

        } else {

            System.out.println("Desenfileirou: " + fronteira.desenfileirar().getNome());

            for (Adjacente a : primeiro.getAdjacentes()) {

                System.out.println("Verificando se ja foi visitado: " + a.getCidade().getNome());
                if (!a.getCidade().isVisitado()) {
                    a.getCidade().setVisitado(true);
                    fronteira.enfileirar(a.getCidade());
                }

            }
            if (fronteira.getNumeroElementos() > 0) {
                buscar();
            }

        }

    }

}
