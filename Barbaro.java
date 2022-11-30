public class Barbaro{

    private double terras;
    private String nome;


    public Barbaro(String name, double land){
        this.nome =name;
        this.terras = land;
    }

    public void herdaTerraPai(double land){
        this.terras = this.terras+land;
    }

    public double getTerras() {
        return terras;
    }

    public String getNome() {
        return nome;
    }

}