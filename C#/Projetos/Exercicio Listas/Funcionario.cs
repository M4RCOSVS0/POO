using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_Listas
{
    internal class Funcionario
    {
        public string? Id { get; set; }
        public string Name { get; set; }
        public double Salario { get; private set; }

        public Funcionario(string id, string name, double salario)
        {
            Id = id;
            Name = name;
            Salario = salario;
        }

        public void AumentoSalario(double p)
        {
            Salario += Salario * (p / 100);
        }

        public override string ToString()
        {
            return $"{Id}, {Name}, {Salario:C}";
        }
    }
}
