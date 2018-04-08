
package praktek03;

public class indomie {
    private String merk;
    private String rasa;
    private double harga;
    
    void cetakinfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                "Rasa \t: "+rasa+"\n"+
                "Harga \t: "+harga+"\n");
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
}
