package grafocidades;

public class Mapa {

    //tem que criar um objeto para cada cidade
    private Cidade portoUniao;
    private Cidade pauloFrontin;
    private Cidade canoinhas;
    private Cidade irati;
    private Cidade palmeira;
    private Cidade campoLargo;
    private Cidade curitiba;
    private Cidade balsaNova;
    private Cidade araucaria;
    private Cidade saoJose;
    private Cidade contenda;
    private Cidade mafra;
    private Cidade tijucas;
    private Cidade lapa;
    private Cidade saoMateus;
    private Cidade tresBarras;

    public Mapa() {

        //Nome da cidade e distancia ficticia(aproximada) em linha reta
        portoUniao = new Cidade("Porto Uniao", 203);
        pauloFrontin = new Cidade("Paulo Frontin", 172);
        canoinhas = new Cidade("Canoinhas", 141);
        irati = new Cidade("Irati", 139);
        palmeira = new Cidade("Palmeira", 59);
        campoLargo = new Cidade("Campo Largo", 27);
        curitiba = new Cidade("Curitiba", 0);
        balsaNova = new Cidade("Balsa Nova", 41);
        araucaria = new Cidade("Araucaria", 23);
        saoJose = new Cidade("Sao Jose", 13);
        contenda = new Cidade("Contenda", 39);
        mafra = new Cidade("Mafra", 94);
        tijucas = new Cidade("Tijucas", 56);
        lapa = new Cidade("Lapa", 74);
        saoMateus = new Cidade("Sao Matheus", 123);
        tresBarras = new Cidade("Tre Barras", 131);

        //Faz as ligacoes das cidades com suas adjacencias
        //nome das cidades adjacentes e a distancia entre elas
        portoUniao.adicionaCidadesAdjacentes(new Adjacente(pauloFrontin, 46));
        portoUniao.adicionaCidadesAdjacentes(new Adjacente(canoinhas, 78));
        portoUniao.adicionaCidadesAdjacentes(new Adjacente(saoMateus, 87));

        pauloFrontin.adicionaCidadesAdjacentes(new Adjacente(portoUniao, 46));
        pauloFrontin.adicionaCidadesAdjacentes(new Adjacente(irati, 75));

        canoinhas.adicionaCidadesAdjacentes(new Adjacente(portoUniao, 78));
        canoinhas.adicionaCidadesAdjacentes(new Adjacente(tresBarras, 12));
        canoinhas.adicionaCidadesAdjacentes(new Adjacente(mafra, 66));

        irati.adicionaCidadesAdjacentes(new Adjacente(pauloFrontin, 75));
        irati.adicionaCidadesAdjacentes(new Adjacente(palmeira, 75));
        irati.adicionaCidadesAdjacentes(new Adjacente(saoMateus, 57));

        palmeira.adicionaCidadesAdjacentes(new Adjacente(irati, 75));
        palmeira.adicionaCidadesAdjacentes(new Adjacente(saoMateus, 77));
        palmeira.adicionaCidadesAdjacentes(new Adjacente(campoLargo, 55));

        campoLargo.adicionaCidadesAdjacentes(new Adjacente(palmeira, 55));
        campoLargo.adicionaCidadesAdjacentes(new Adjacente(balsaNova, 22));
        campoLargo.adicionaCidadesAdjacentes(new Adjacente(curitiba, 29));

        curitiba.adicionaCidadesAdjacentes(new Adjacente(campoLargo, 29));
        curitiba.adicionaCidadesAdjacentes(new Adjacente(balsaNova, 51));
        curitiba.adicionaCidadesAdjacentes(new Adjacente(araucaria, 37));
        curitiba.adicionaCidadesAdjacentes(new Adjacente(saoJose, 15));

        balsaNova.adicionaCidadesAdjacentes(new Adjacente(curitiba, 51));
        balsaNova.adicionaCidadesAdjacentes(new Adjacente(campoLargo, 22));
        balsaNova.adicionaCidadesAdjacentes(new Adjacente(contenda, 19));

        araucaria.adicionaCidadesAdjacentes(new Adjacente(curitiba, 37));
        araucaria.adicionaCidadesAdjacentes(new Adjacente(contenda, 18));

        saoJose.adicionaCidadesAdjacentes(new Adjacente(curitiba, 15));
        saoJose.adicionaCidadesAdjacentes(new Adjacente(tijucas, 49));

        contenda.adicionaCidadesAdjacentes(new Adjacente(balsaNova, 19));
        contenda.adicionaCidadesAdjacentes(new Adjacente(araucaria, 18));
        contenda.adicionaCidadesAdjacentes(new Adjacente(lapa, 26));

        mafra.adicionaCidadesAdjacentes(new Adjacente(tijucas, 99));
        mafra.adicionaCidadesAdjacentes(new Adjacente(lapa, 57));
        mafra.adicionaCidadesAdjacentes(new Adjacente(canoinhas, 66));

        tijucas.adicionaCidadesAdjacentes(new Adjacente(mafra, 99));
        tijucas.adicionaCidadesAdjacentes(new Adjacente(saoJose, 49));

        lapa.adicionaCidadesAdjacentes(new Adjacente(contenda, 26));
        lapa.adicionaCidadesAdjacentes(new Adjacente(saoMateus, 60));
        lapa.adicionaCidadesAdjacentes(new Adjacente(mafra, 57));

        saoMateus.adicionaCidadesAdjacentes(new Adjacente(palmeira, 77));
        saoMateus.adicionaCidadesAdjacentes(new Adjacente(irati, 57));
        saoMateus.adicionaCidadesAdjacentes(new Adjacente(lapa, 60));
        saoMateus.adicionaCidadesAdjacentes(new Adjacente(tresBarras, 43));
        saoMateus.adicionaCidadesAdjacentes(new Adjacente(portoUniao, 87));

        tresBarras.adicionaCidadesAdjacentes(new Adjacente(saoMateus, 43));
        tresBarras.adicionaCidadesAdjacentes(new Adjacente(canoinhas, 12));

    }

    public Cidade getPortoUniao() {
        return portoUniao;
    }

    public void setPortoUniao(Cidade portoUniao) {
        this.portoUniao = portoUniao;
    }

    public Cidade getPauloFrontin() {
        return pauloFrontin;
    }

    public void setPauloFrontin(Cidade pauloFrontin) {
        this.pauloFrontin = pauloFrontin;
    }

    public Cidade getCanoinhas() {
        return canoinhas;
    }

    public void setCanoinhas(Cidade canoinhas) {
        this.canoinhas = canoinhas;
    }

    public Cidade getIrati() {
        return irati;
    }

    public void setIrati(Cidade irati) {
        this.irati = irati;
    }

    public Cidade getPalmeira() {
        return palmeira;
    }

    public void setPalmeira(Cidade palmeira) {
        this.palmeira = palmeira;
    }

    public Cidade getCampoLargo() {
        return campoLargo;
    }

    public void setCampoLargo(Cidade campoLargo) {
        this.campoLargo = campoLargo;
    }

    public Cidade getCuritiba() {
        return curitiba;
    }

    public void setCuritiba(Cidade curitiba) {
        this.curitiba = curitiba;
    }

    public Cidade getBalsaNova() {
        return balsaNova;
    }

    public void setBalsaNova(Cidade balsaNova) {
        this.balsaNova = balsaNova;
    }

    public Cidade getAraucaria() {
        return araucaria;
    }

    public void setAraucaria(Cidade araucaria) {
        this.araucaria = araucaria;
    }

    public Cidade getSaoJose() {
        return saoJose;
    }

    public void setSaoJose(Cidade saoJose) {
        this.saoJose = saoJose;
    }

    public Cidade getContenda() {
        return contenda;
    }

    public void setContenda(Cidade contenda) {
        this.contenda = contenda;
    }

    public Cidade getMafra() {
        return mafra;
    }

    public void setMafra(Cidade mafra) {
        this.mafra = mafra;
    }

    public Cidade getTijucas() {
        return tijucas;
    }

    public void setTijucas(Cidade tijucas) {
        this.tijucas = tijucas;
    }

    public Cidade getLapa() {
        return lapa;
    }

    public void setLapa(Cidade lapa) {
        this.lapa = lapa;
    }

    public Cidade getSaoMateus() {
        return saoMateus;
    }

    public void setSaoMateus(Cidade saoMateus) {
        this.saoMateus = saoMateus;
    }

    public Cidade getTresBarras() {
        return tresBarras;
    }

    public void setTresBarras(Cidade tresBarras) {
        this.tresBarras = tresBarras;
    }

}
