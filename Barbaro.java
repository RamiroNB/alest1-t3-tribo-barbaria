public class Barbaro{

    private double terras;
    private String nome;
    private int gen;


    public Barbaro(String name, double land, int gen){
        this.nome =name;
        this.terras = land;
    }

    public void herdaTerraPai(double land){
        this.terras = this.terras+land;
    }

    public double getTerras() {
        return terras;
    }
    public int getGen() {
        return gen;
    }

    public String getNome() {
        return nome;
    }

    

}