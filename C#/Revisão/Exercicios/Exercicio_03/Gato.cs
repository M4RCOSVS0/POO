using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_03
{
    internal class Gato : Animal
    {
        public Gato(string nome, int idade, double peso) : base(nome, idade, peso)
        {
        }

        public override double CalcularVelocidade()
        {
            return 50 - ( Idade * 2 );
        }

        public override string FazerSom()
        {
           return "MIAU";
        }
        public override string Mover()
        {
            return "Caminhando silenciosamente";
        }

    }
}
