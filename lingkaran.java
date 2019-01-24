public class lingkaran {
    double r = 50;
    double phi = 3.14;
    double luas;

    public void hitung(){
        luas = 2*phi*r;
        System.out.println("luas jari = "+luas);
    }
    public static void main(String[] args) {
        lingkaran b = new lingkaran();
        b.hitung();
    }
}
