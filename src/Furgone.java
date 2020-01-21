public class Furgone implements Veicolo {
    private Targa targa;
    private String marca;
    private Alimentazione alimentazione;
    private Double cilindrata;
    private int porte;
    private Double capacita;

    public Furgone(Targa targa, String marca, Alimentazione alimentazione, Double cilindrata, int porte, Double capacita){
        this.targa = targa;
        this.marca = marca;
        this.alimentazione = alimentazione;
        this.cilindrata = cilindrata;
        this.porte = porte;
        this.capacita = capacita;
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

    public Double getCapacita() {
        return capacita;
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
