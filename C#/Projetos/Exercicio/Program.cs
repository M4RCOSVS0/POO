using Exercicio.Entities;
using Exercicio.Entities.Enums;
using System.Globalization;

namespace Exercicio
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter cliente data:");
            Console.Write("Name: ");
            string name = Console.ReadLine();
            Console.WriteLine("Email: ");
            string email = Console.ReadLine();         
            Console.Write("Birth date (DD/MM/YYYY): ");
            DateTime birthDate = DateTime.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine("Enter order data: ");
            Console.Write("Status: ");
            OrderStatus status = Enum.Parse<OrderStatus>(Console.ReadLine());
            

            Client client = new Client(name,email,birthDate);
            Order order = new Order(DateTime.Now,status,client);

            Console.Write("How many items to this order? ");
            int quant = int.Parse(Console.ReadLine());


            for (int i = 0; i < quant; i++)
            {
                Console.WriteLine($"Enter #{i+1} item data:");
                Console.Write("Product name: ");
                string nome = Console.ReadLine();
                Console.Write("Product price: ");
                double price = double.Parse(Console.ReadLine());

                Product product = new Product(nome,price);

                Console.WriteLine("Quantity: ");
                int quatity = int.Parse(Console.ReadLine());
                
                OrderItem orderItems = new OrderItem(quatity,price,product);
                order.Items.Add(orderItems);
            }

            Console.WriteLine();
            Console.WriteLine("ORDER SUMMARY:");
            Console.WriteLine(order);
        }
    }
}
