using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_Proposto02.Entities
{
    abstract class TaxPayer
    {
        public string Name { get; set; }
        public double Anuallcome { get; set; }

        protected TaxPayer(string name, double anuallcome)
        {
            Name = name;
            Anuallcome = anuallcome;
        }

        public abstract double Tax();
    }
}
