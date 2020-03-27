package grafocidades;

import java.util.ArrayList;
import java.util.List;

public class Cidade {

    private String nome;
    private boolean visitado; //para verificar se a cidade já foi visitado
    private int distanciaObjetivo;
    private List<Adjacente> adjacentes; //sao as cidades que estao ligadas diretamente com essa cidade daqui uma cidade pode ter varias adjacencias

    public Cidade(String nome, int distanciaObjetivo) {
        this.nome = nome;
        visitado = false; //quando criar uma cidade ela ainda nao foi visitada
        adjacentes = new ArrayList<>();
        this.distanciaObjetivo = distanciaObjetivo;

    }

    //Metodo para adicionar cidades adjacentes a ela
    public void adicionaCidadesAdjacentes(Adjacente cidade) {

        adjacentes.add(cidade);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(List<Adjacente> adjacentes) {
        this.adjacentes = adjacentes;

    }

    public int getDistanciaObjetivo() {
        return distanciaObjetivo;
    }

    public void setDistanciaObjetivo(int distanciaObjetivo) {
        this.distanciaObjetivo = distanciaObjetivo;
    }

}
