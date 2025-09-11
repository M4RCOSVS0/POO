using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_02
{
    internal class Carro : Veiculo
    {

        public int NumeroPortas { get; set; }

        public Carro(string marca, string modelo, int ano, int numeroPortas) : base(marca, modelo, ano)
        {
            NumeroPortas = numeroPortas;
        }

        public override void Acelerar()
        {
            base.Acelerar();
            Console.WriteLine("VRUM VRUM VRUM");
        }
    }
}
