using Exercicio_Resolvido01.Entities;
using System.Collections.Generic;
using System.Globalization;

namespace Exercicio_Resolvido01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Employee> list = new List<Employee>();

            Console.Write("Enter the number of employees");
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                Console.WriteLine($"Employee #{i+1} data:");
                Console.Write("Outsourced (y/n)? ");
                char ch = char.Parse(Console.ReadLine());
                Console.Write("Name: ");
                string name = Console.ReadLine();
                Console.Write("Hours: ");
                int hours = int.Parse(Console.ReadLine());
                Console.Write("Value per hour: ");
                double valuePerHour = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);
                if (ch == 'y')
                {
                    Console.Write("Addional charge: ");
                    double additionalCharge = double.
                        Parse(Console.ReadLine(),CultureInfo.InvariantCulture);
                    list.Add(new OutSourceEmployee(additionalCharge, name, hours, valuePerHour));
                }
                else
                {
                    list.Add(new Employee(name, hours, valuePerHour));
                }
            }

            Console.WriteLine();
            Console.WriteLine("Payments");
            foreach (Employee emp in list)
            {
                Console.WriteLine($"{emp.Name} - $ {emp.Payment().ToString("F2",CultureInfo.InvariantCulture)}");
            }
        }
    }
}
