using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_02
{
    public abstract class Veiculo
    {
        protected string Marca { get; set; }
        protected string Modelo { get; set; }
        protected int Ano { get; set; }

        public Veiculo(string marca, string modelo, int ano)
        {
            Marca = marca;
            Modelo = modelo;
            Ano = ano;
        }

        public virtual void Acelerar() {
            Console.WriteLine($"O veículo: {Modelo} da Marca {Marca} do Ano {Ano} Acelera assim: ");
            Console.WriteLine("-------------------");
        }
        
        
    }
}
