
import buscas.AEstrela;
import buscas.Gulosa;
import buscas.Largura;
import buscas.Profundidade;
import estruturas.Fila;
import estruturas.Pilha;
import estruturas.Recursao;
import estruturas.VetorOrdenado;
import grafocidades.Mapa;

public class Main {
    
    public static void main(String[] args) {
        
        Mapa mapa = new Mapa();
        Mapa mapa1 = new Mapa();
               
        
       //Largura l = new Largura(mapa.getCampoLargo(),mapa.getPalmeira());//cidade inicial e cidade final
        //l.buscar();
             
       //Profundidade p = new Profundidade(mapa.getPauloFrontin(),mapa.getCuritiba());//cidade inicial e cidade final
      // p.buscar();
        
      
      
        //Gulosa gulosa = new Gulosa(mapa.getCuritiba()); //passa como parametro a cidade que quero ir
        //gulosa.buscar(mapa.getPortoUniao()); // cidade onde estou
        
        
        
        AEstrela estrela = new AEstrela(mapa.getCuritiba());//passa como parametro a cidade que quero ir
        estrela.buscar(mapa.getPortoUniao());// cidade onde estou
        
    }
    
}
