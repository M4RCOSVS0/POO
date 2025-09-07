using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_Proposto01.Entities
{
    internal class UsedProduct : Product
    {
        public DateOnly ManufactureDate  { get; set; }

        public UsedProduct()
        {
        }

        public UsedProduct(string name, double price, DateOnly manufactureDate) : base(name, price)
        {
            ManufactureDate = manufactureDate;
        }

        public override string PriceTag()
        {
            return $"{Name} (used) $ {Price.ToString("F2", CultureInfo.InvariantCulture)} (Manufacture date: ${ManufactureDate})";
        }


    }
}
