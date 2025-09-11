using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_02
{
    internal class Moto : Veiculo
    {
        public Moto(string marca, string modelo, int ano, int cilindrada) : base(marca, modelo, ano)
        {
            Cilindrada = cilindrada;
        }

        public int Cilindrada { get; set; }

        public override void Acelerar()
        {
            base.Acelerar();
            Console.WriteLine("Ran dan dan");
        }
    }
}
