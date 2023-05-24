    import java.util.Scanner;

    public class Main {
        public  static void main(String[] args) {
            int mat, fizik, kimya, tarih, muzik, turkce;

            Scanner inp = new Scanner(System.in);

            System.out.print("Matematik Notunu Giriniz .: ");
            mat = inp.nextInt();

            System.out.print("Fizik Notunu Giriniz : ");
            fizik = inp.nextInt();

            System.out.print("Kimya Notunu Giriniz : ");
            kimya = inp.nextInt();

            System.out.print("Tarih Notunu Giriniz : ");
            tarih = inp.nextInt();

            System.out.print("Müzik Notunu Giriniz : ");
            muzik = inp.nextInt();

            System.out.print("Türkçe Notunu Giriniz : ");
            turkce = inp.nextInt();

            int toplam = (mat + fizik + kimya + tarih + muzik + turkce);
            double sonuc = (toplam / 6.0);

            System.out.println("Not Ortalaması .: " + sonuc);
            System.out.println(sonuc < 60 ? "Daha Çook Çalışman Lazım :D" : "Aferim Köftehor. :D");


        }
    }

