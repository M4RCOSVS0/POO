using Exercicio_Proposto01.Entities;
using System.Globalization;
using System.Security.AccessControl;

namespace Exercicio_Proposto01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Product> list = new List<Product>();

            Console.Write("Enter the number of products: ");
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                Console.WriteLine($"Product #{i + 1} data: ");
                Console.Write("Common, used or imported (c/u/i)? ");
                char op = char.Parse(Console.ReadLine());
                Console.Write("Name: ");
                string name = Console.ReadLine();
                Console.Write("Price: ");
                double price = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

                switch (op)
                {
                    case 'i':
                        Console.Write("Custom fee: ");
                        double custom = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                        list.Add(new ImportedProduct(name, price, custom));
                        break;
                    case 'u':
                        Console.Write("Manufacture date (DD/MM/YYYY): ");
                        DateOnly data = DateOnly.Parse(Console.ReadLine());
                        list.Add(new UsedProduct(name, price, data));
                        break;
                    default:
                        list.Add(new Product(name, price));
                        break;
                }
            }

            Console.WriteLine("\nPRICE TAGS:");
            foreach (Product prod in list)
            {
                Console.WriteLine($"{prod.PriceTag()}");
            }

        }
    }
}
