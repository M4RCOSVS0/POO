using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_Proposto01.Entities
{
    internal class ImportedProduct : Product
    {
        public double CustomFree { get; set; }
        
        public ImportedProduct()
        {
        }

        public ImportedProduct(string name, double price, double customfree) : base(name, price)
        {
            CustomFree = customfree;
        }

        public double TotalPrice()
        {
            return Price + CustomFree;
        }

        public override string PriceTag()
        {
            return $"{Name} $ {TotalPrice().ToString("F2",CultureInfo.InvariantCulture)} (Customs fee: $ {CustomFree.ToString("F2", CultureInfo.InvariantCulture)})";
        }

    }
}
