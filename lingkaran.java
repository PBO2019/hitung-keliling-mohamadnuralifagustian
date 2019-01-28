public class lingkaran {
    private int r = 20;
    private int phi = 22/7;
    private double keliling;

    public lingkaran() {

    }

    public void hitung(int i) {
        this.keliling = 2 * r * phi;
    }

     public void setKeliling(int luas){
        this.keliling = keliling;
     }

    public int getr() {
        return r;
    }



    public void hitung() {
        this.keliling = 2 * r * phi;
    }
}
