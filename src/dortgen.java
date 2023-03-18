public class dortgen {
    private double taban;
    private double yukseklik;

    public dortgen() {
        this.taban = 0;
        this.yukseklik = 0;
    }

    public dortgen(double w) {
        this.taban = w;
        this.yukseklik = w;
    }

    public dortgen(double w, double h) {
        this.taban = w;
        this.yukseklik = h;
    }
    public void boyutGoster(){
        System.out.println("G:"+this.taban+", Y:"+this.yukseklik);
    }
    //Her bir değişken için get set fonksiyonları yazılır (duruma göre bazıları yazılmayabilir)
    //get ile başlayanlar değişkenin değerini öğrenmek için yazılır
    //set ile başlayanlar değikenin değerini değiştirmek için yazılır

    public double getGenislik(){
        return this.taban;
    }
    public double getYukseklik(){
        return this.yukseklik;
    }
    public void setGenislik(double w){
        this.taban=w;
    }
    public void getYukseklik(double h){
        this.yukseklik=h;
    }
    public double alanHesapla(){
        return this.taban*this.yukseklik;
    }
}
