using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Course02.Entities
{
    internal class HoursContract
    {
        public DateTime Date { get; set; }
        public double ValuePerHours { get; set; }
        public int Hours { get; set; }

        public HoursContract(DateTime date, double valuePerHours, int hours)
        {
            Date = date;
            ValuePerHours = valuePerHours;
            Hours = hours;
        }

        public HoursContract()
        {
        }

        public double TotalValue()
        {
            return Hours * ValuePerHours;
        }
    }
}
