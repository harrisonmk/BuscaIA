package grafocidades;

public class Adjacente {

    private Cidade cidade; //Relacionamento tem um 
    private int distancia; //distancia real pela estrada
    private int distanciaAEstrela; // para calcular Distancia em linha reta + a distancia pela estrada (ficticia+real) 
    
    

    public Adjacente(Cidade cidade,int distancia) {
        this.cidade = cidade;
        this.distancia = distancia;
        //Distancia em linha reta + distancia pela estrada
        this.distanciaAEstrela = this.cidade.getDistanciaObjetivo()+ this.distancia;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getDistanciaAEstrela() {
        return distanciaAEstrela;
    }

    public void setDistanciaAEstrela(int distanciaAEstrela) {
        this.distanciaAEstrela = distanciaAEstrela;
    }
    
    
    
    

}
