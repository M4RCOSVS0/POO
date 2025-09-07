using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_Proposto02.Entities
{
    internal class Company : TaxPayer
    {

        public int NumberOfEmployees { get; set; }
        public Company(string name, double anuallcome,int number) : base(name, anuallcome)
        {
            NumberOfEmployees = number;
        }

        public override double Tax()
        {
            if (NumberOfEmployees > 10)
            {
                return Anuallcome * 0.14;
            }
            else
            {
                return Anuallcome * 0.15;
            }
        }


    }
}
