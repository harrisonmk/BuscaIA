package estruturas;

public class Recursao {

    int i = 0;

    public void funcao() {

        System.out.println("Executando...");

        if (i < 5) {
            i++;
            funcao();
        }

    }

}
