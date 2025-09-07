using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_Resolvido01.Entities
{
    internal class OutSourceEmployee : Employee
    {
        public double AdditionalCharge { get; set; }

        public OutSourceEmployee()
        {
        }

        public OutSourceEmployee(double additionalCharge, string name, int hours, double valuePerHour) : base(name, hours, valuePerHour)
        {

            AdditionalCharge = additionalCharge;
        }

        public override double Payment()
        {
            return base.Payment() + 1.1 * AdditionalCharge;
        }



    }
}
