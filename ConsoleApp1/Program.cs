using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string isimSoyisim = "Sıla Tahmaz";
            Console.WriteLine(isimSoyisim);
            isimSoyisim = "Selin Tahmaz";
            Console.WriteLine(isimSoyisim);
            string buyukKarakter = isimSoyisim.ToUpper();
            Console.WriteLine(buyukKarakter);
            string kucukKarakter = isimSoyisim.ToLower();
            Console.WriteLine(kucukKarakter);
            string belirliBirBolum = isimSoyisim.Substring(2, 4);
            Console.WriteLine(belirliBirBolum);
            DateTime tarihSaat = DateTime.Now;
            Console.WriteLine(tarihSaat);
            string degiskenval1 = "Sıla Tahmaz";
            string degiskenval2 = "Selin Tahmaz";
            degiskenval1 = degiskenval2;
            degiskenval2 = "Sibel Tahmaz";
            Console.WriteLine(degiskenval1);
            Console.WriteLine(degiskenval2);
            Console.ReadLine();
         }
    }
}
