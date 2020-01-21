public class Moto implements Veicolo {
    private Targa targa;
    private String marca;
    private Alimentazione alimentazione;
    private Double tempi;
    private TipoMoto tipo;

    public Moto(Targa targa, String marca, Alimentazione alimentazione, Double tempi, TipoMoto tipo){
        this.targa = targa;
        this.marca = marca;
        this.alimentazione = alimentazione;
        this.tempi = tempi;
        this.tipo = tipo;
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

    public Double getTempi() {
        return tempi;
    }

    public TipoMoto getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "targa=" + targa.toString() +
                ", marca='" + marca + '\'' +
                ", alimentazione=" + alimentazione +
                ", tempi=" + tempi +
                ", tipo=" + tipo +
                '}';
    }
}
