public class bujursangkar {
    int keliling ;
    int sisi = 45;

    public void hitungbujursangkar(){
        keliling = 4*sisi;
        System.out.println("Keliling Bujursangkar  = "+keliling);
    }
    public static void main (String []gol){
        bujursangkar bs = new bujursangkar();
        bs.hitungbujursangkar();
    }
}
