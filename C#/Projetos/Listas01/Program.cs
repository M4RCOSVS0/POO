using System.Collections.Generic;
namespace Listas01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> list = new List<string>(); //lista vazia

            list.Add("Maria");//add adciona no final
            list.Add("Alex");
            list.Add("Bob");
            list.Add("Ana");
            list.Insert(2, "Marco");

            foreach (var item in list)
            {
                Console.WriteLine(item);
            }

            Console.WriteLine("List Count "+ list.Count);

            string? s1 = list.Find(x => x[0] == 'A');
            Console.WriteLine("First 'A': "+s1);

            string? s2 = list.FindLast(x => x[0] == 'A');
            Console.WriteLine("Last 'B': "+s2);

            int pos1 = list.FindIndex(x => x[0] == 'A');
            Console.WriteLine("First Position A "+ pos1);

            int pos2 = list.FindLastIndex(x => x[0] == 'A');
            Console.WriteLine("First Position A " + pos2);

            List<string> list2 = list.FindAll(x => x.Length == 5);

            Console.WriteLine("--------------------------");
            foreach (var item in list2)
            {
                Console.WriteLine(item);
            }

            list.Remove("Alex");
            Console.WriteLine("---------------------------");
            foreach (var item in list)
            {
                Console.WriteLine(item);
            }

            list.RemoveAll(x => x[0] == 'M');
            Console.WriteLine("---------------------------");
            foreach (var item in list)
            {
                Console.WriteLine(item);
            }

            list.RemoveAt(1);
            Console.WriteLine("---------------------------");
            foreach (var item in list)
            {
                Console.WriteLine(item);
            }

            list.RemoveRange(2, 2);
            Console.WriteLine("---------------------------");
            foreach (var item in list)
            {
                Console.WriteLine(item);
            }

            list.RemoveRange(2, 2);
            Console.WriteLine("---------------------------");
            foreach (var item in list)
            {
                Console.WriteLine(item);
            }
        } 
    }
}
