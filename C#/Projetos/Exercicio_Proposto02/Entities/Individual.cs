using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_Proposto02.Entities
{
    internal class Individual : TaxPayer
    {
        public double HealthExpendidures { get; set; }

        public Individual(string name, double anuallcome, double healthExpendidures) : base(name, anuallcome)
        {
            {
                HealthExpendidures = healthExpendidures;
            }

        }

        public override double Tax()
        {
            if (Anuallcome < 20000)
            {
                return Anuallcome * 0.15;
            }
            else if (HealthExpendidures > 0)
            {
                return (Anuallcome * 0.25) - (HealthExpendidures * 0.5);
            }
            else
            {
                return Anuallcome * 0.25;
            }
        }
    }
}
