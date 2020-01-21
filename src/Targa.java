import java.util.Date;

public class Targa {
    private String provincia;
    private String numero;
    private Date anno;

    public Targa(String provincia, String numero, Date anno){
        this.provincia = provincia;
        this.numero = numero;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Targa{" +
                "provincia='" + provincia + '\'' +
                ", numero='" + numero + '\'' +
                ", anno=" + anno +
                '}';
    }
}
