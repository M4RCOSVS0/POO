using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_06
{
    internal class Funcionario
    {
        private string nome;
        private decimal salarioBruto;
        private Cargo cargo;

        public Cargo Cargo
        {
            get => cargo;
            set => cargo = value;
        }

        public string Nome
        {
            get => nome;
            set
            {
                if (string.IsNullOrWhiteSpace(value))
                    throw new ArgumentException("Nome não pode ser vazio.");
                nome = value;
            }
        }

        public decimal SalarioBruto
        {
            get => salarioBruto;
            set
            {
                if (value < 0)
                    throw new ArgumentException("Valor não pode ser menor que 0");
                salarioBruto = value;
            }
        }

        public decimal SalarioLiquido {
            get => salarioBruto - CalcularImposto(salarioBruto); 
        }

        public static decimal TaxaImposto { get; } = 0.15m; 

        public Funcionario(string nome, decimal salarioBruto, Cargo cargo)
        {
            Nome = nome;
            SalarioBruto = salarioBruto;
            Cargo = cargo;
        }

        public static decimal CalcularImposto(decimal salario)
        {
            if (salario <= 2000)
            {
                return 0;
            }
            else if (salario <= 5000)
            {
                return salario * 0.10m;
            }
            else
            {
                return salario * TaxaImposto;
            }
        }

        public void ExibirInfo()
        {
            Console.WriteLine($"Nome {Nome}, Cargo {Cargo}, salario bruto {SalarioBruto:F2}, salário liquído {SalarioLiquido:F2}");
        }

    }
}
