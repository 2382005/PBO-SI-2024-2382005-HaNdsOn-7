package contohkelaspertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(int kecepatanMaks, String merek, String warna) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
    void tampilkanInfo() {
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merek);
        System.out.println("KecepatanMaks : " + kecepatanMaks);

    }
}

