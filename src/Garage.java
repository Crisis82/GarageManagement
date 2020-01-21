/**
 * classe per la gestiore del garage e dei veicoli all'interno
 */
public class Garage {
    private static final int POSTI_MAX = 15;
    private Veicolo[] mappaParcheggi;

    public Garage() {
        mappaParcheggi = new Veicolo[POSTI_MAX];
    }

    public void parcheggia(Veicolo veicoloDaParcheggiare, int posto){
        mappaParcheggi[posto] = veicoloDaParcheggiare;
    };

    public void rimuovi(int postoDaLiberare){
        mappaParcheggi[postoDaLiberare] = null;
    }

    public void rimuovi(Veicolo veicoloDaRimuovere){
        for (int i = 0; i <POSTI_MAX ; i++) {
            if(mappaParcheggi[i].equals(veicoloDaRimuovere)){
                mappaParcheggi[i] = null;
                break;
            }
        }
    }

    public void getSituazione(){
        for (int i = 0; i <POSTI_MAX ; i++) {
            if(mappaParcheggi[i]!=null){
                System.out.println("posto " + i + "occupato");
            } else{
                System.out.println("posto " + i + "libero");
            }
        }
    }

    public int getPosto(Veicolo veicolo){
        int postoCercato = 0;
        for (int i = 0; i <POSTI_MAX ; i++) {
            if(mappaParcheggi[i].equals(veicolo)){
                postoCercato = i;
                break;
            }
        }
        return postoCercato;
    }

     public void getInfo(Veicolo veicolo){
         for (int i = 0; i <POSTI_MAX ; i++) {
             if(mappaParcheggi[i].equals(veicolo)){
                 System.out.println(mappaParcheggi[i].toString());
                 break;
             }
         }
     }
}
