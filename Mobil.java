public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(int kecepatanMaks, String merek, String warna) {
        this.kecepatanMaks = kecepatanMaks;
        this.merek = merek;
        this.warna = warna;
    }
    void tampilkanInfo() {
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merek);
        System.out.println("KecepatanMaks : " + kecepatanMaks);

    }
}
