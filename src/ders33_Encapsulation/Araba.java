package ders33_Encapsulation;

public class Araba {

    String marka = "Marka belirtilmedi"; // access modifier yoksa; Default Access Modifier'dir.
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli"; // tüm arabalar elektrikli ise bu variable'in degistirilmemesi lazim.
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim.
    // model'e deger atanabilsin ama görünemesin. (setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin (getter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
