using Exercicio06;
using System.Globalization;
namespace exercicio06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Qual a cotação do dólar? ");
            double cot = double.Parse(Console.ReadLine());
            Console.Write("Quantos dólares você irá comprar? ");
            double qte = double.Parse(Console.ReadLine());
            Console.WriteLine($"Valor a ser pago em reais = {ConversorMoeda.ConverteDolar(cot, qte).ToString("F2",CultureInfo.InvariantCulture)}"); 

        }
    }
}
