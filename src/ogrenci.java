public class ogrenci {
    public int ogrNo;
    public String ogrAd;
    public String ogrSoyad;
    public int ogrYas;

    public ogrenci() {
        this.ogrNo = 0;
        this.ogrAd = null;
        this.ogrSoyad = null;
        this.ogrYas = 0;
    }
    // Yapılandırıcı/yapıcı fonksiyon(constructor)
    /*
     * Sınıftan nesne türetilirken otomatik olarak çalışan fonksiyondur
     * Yapıcı fonksiyonun adı class adı ile birebir aynı olmalıdır
     * (Class içerisinde yapıcı metod kodlanmamış ise derleyici default olarak
     * parametre almayan bir yapıcı metodu ekler)
     * public ogrenci(){
     * 
     * }
     * Yapıcı metodda geri dönüş tipi kısmı boş bırakılır( geri değer göndürmez)
     * Yapıcı metod public olarak tanımlanmalıdır
     * Bir sınıfta birden fazla yapıcı metod yapılabilir
     * Sınıftan nesne türetilirken otomatik olrak yapılmasını ön işlemleri yapıcı
     * metod içerisine yazmalıyız
     * Bir sınıfa yapıcı metod yazıldığında derleyici yukarıda bahsettiğimiz
     * parametre almayan içi boş bir yapıcı metodu eklemez
     * 
     */

    public ogrenci(int n, String a, String s, int y) {
        this.ogrNo = n;
        this.ogrAd = a;
        this.ogrSoyad = s;
        this.ogrYas = y;
    }
}
