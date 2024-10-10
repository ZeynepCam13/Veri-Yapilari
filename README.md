# Veri-Yapilari
veri yapıları dersi uygulama ve projeler
UYGULAMA İÇERİĞİ:
1. Eclipse veya istenen IDE ortamında bir JAVA projesi oluşturun.
2. Proje içinde YeniPkg isimli bir paket oluşturun.
3. YeniPkg altında AnaSinif isimli sınıf oluşturun ve main() metodunun bu sınıfta olmasını sağlayın.
4. AnaSinif altında en az 3 farklı özellik tanımlayın.
5. Özelliklere ilk değerler atayan 2 farklı overload edilmiş yapılandırıcı yazın. Bu durumda JAVA
tarafından otomatik oluşturulan parametresiz yapılandırıcı ile birlikte 3 farklı yapılandırıcı olduğunu
unutmayın.
6. Sınıf içinde sınıf özelliklerini kullanmayan int bir değeri ekrana yazdıran, değer döndürmeyen, statik
bir metot yazın. Bu metodu main fonksiyonunda AnaSinif’dan bir nesne oluşturmadan çağırıp
kullanın.
7. Paket içinde IkinciSinif isimli yeni sınıf oluşturun.
8. Bu sınıfta da 3 farklı özellik tanımlayın. Fakat bu değerlerin erişim belirleyicilerini private yapın. Bu
değerlere değer atama (set) ve değerlerinin başka sınıflardan okunması (get) için get/set metotları
tanımlayın.
9. AnaSinif içinde IkinciSinif türünden parametre alan ikinciSinifDegerYazdir(IkinciSinif iks) metodunu
yazın. Bu metodun parametre olarak verilen (IkinciSinif iks) sınıfın özelliklerini sınıfın get
metotlarını kullanarak ekrana yazdırmasını sağlayın.
10. Yazılan ikinciSinifDegerYazdir() metodu main içinde çağırmadan önce yine main metodu içerisinde
IkinciSınıf türünden nesne tanımlanması gerektiğini unutmayın. Bu nesneyi parametre olarak
metodun parametresine yazarak metodu çalıştırın.
11. Ayrıca AnaSinif içine IkinciSinif türünde dönüş değeri olan ikinciSinifaDegerAta() metodu
yazılacaktır. Metota parametre olarak IkinciSinif sınıfındaki özelliklerle aynı tiplere sahip parametre
atanacaktır. (örnek: ikinciSinifaDegerAta(int sinifDeger1, String sinifDeger2, float sinifDeger3) )
12. ikinciSinifaDegerAta() metodu içinde bu parametrelerden gelen değerleri IkinciSinif içindeki
özelliklere, sınıfın set metotlarını kullanılarak atayın.
13. AnaSinif içindeki main metodunda IkinciSinif sınıfı türünde, boyutu 10 olan dizi nesne tanımlayın.
14. Bir for döngüsü içerisinde dizi nesnelerin yapılandırıcılarını çağırarak yapılandırılmasını sağlayın.
15. Yeni bir for döngüsü oluşturun. Döngü içinde 10 adet sınıfın her birisinin 3 özelliğine klavyeden girdi
alınarak atanmasını sağlayın. Döngü çalıştığında 10 adet nesneye ait 3 özelliği ayrı ayrı girin.

16. Yapılandırılan nesneler yine bir for döngüsü içinde her bir sınıfın tüm özelilerini ekrana yazdıran
ikinciSinifDegerYazdir(IkinciSinif iks) metodunu çağırarak 15. adımda girdiğiniz değerlerin ekrana
yazdırılmasını sağlayın.
