using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio.Entities
{
    internal class Product
    {
        public string Name { get; set; }
        public double price { get; set; }

        public Product()
        {

        }

        public Product(string name, double price)
        {
            Name = name;
            this.price = price;
        }
    }
}
