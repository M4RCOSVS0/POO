using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioProposto_8.Entities
{
    internal class Installment
    {
        public DateTime  DueDate { get; set; } // Data de Vencimento
        public Double Amount { get; set; } //Valor

        public Installment(DateTime dueDate, double amount)
        {
            DueDate = dueDate;
            Amount = amount;
        }

        public override string ToString()
        {
            return $"{DueDate} - {Amount.ToString("F2",CultureInfo.InvariantCulture)}";
        }
    }
}
