using Exercicio_Proposto02.Entities;
using System.Globalization;

namespace Exercicio_Proposto02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<TaxPayer> lis = new List<TaxPayer>();

            Console.Write("Enter the number of tax payers: ");
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                Console.Write("Individual or company (i/c)? ");
                char op = char.Parse(Console.ReadLine());
                Console.Write("Name: ");
                string name = Console.ReadLine();
                Console.Write("Anual income: ");
                double anaul = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                if (op == 'i')
                {
                    Console.Write("Health expendidures: ");
                    double health = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                    lis.Add(new Individual(name, anaul, health));
                }
                else if (op == 'c')
                {
                    Console.Write("Number of employees: ");
                    int emp = int.Parse(Console.ReadLine());
                    lis.Add(new Company(name, anaul, emp));
                }
            }
            Console.WriteLine("\nTAXED PAID:");
            double s = 0.0;
            foreach (TaxPayer tax in lis)
            {
                Console.WriteLine($"{tax.Name}: $ {tax.Tax().ToString("F2",CultureInfo.InvariantCulture)}");
                s += tax.Tax();
            }

            Console.WriteLine("Total Taxes: $"+ s.ToString("F2", CultureInfo.InvariantCulture));
        }
    }
}
