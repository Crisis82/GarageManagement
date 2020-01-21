public class Auto implements Veicolo {
    private Targa targa;
    private String marca;
    private Alimentazione alimentazione;
    private Double cilindrata;
    private int porte;

    public Auto(Targa targa, String marca, Alimentazione alimentazione, Double cilindrata, int porte){
        this.targa = targa;
        this.marca = marca;
        this.alimentazione = alimentazione;
        this.cilindrata = cilindrata;
        this.porte = porte;
    }

    @Override
    public Targa getTarga() {
        return targa;
    }

    @Override
    public String getMarca(){
        return marca;
    }

    @Override
    public Alimentazione getAlimentazione() {
        return alimentazione;
    }

    public Double getCilindrata() {
        return cilindrata;
    }

    public int getPorte() {
        return porte;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "targa=" + targa.toString() +
                ", marca='" + marca + '\'' +
                ", alimentazione=" + alimentazione +
                ", cilindrata=" + cilindrata +
                ", porte=" + porte +
                '}';
    }
}
