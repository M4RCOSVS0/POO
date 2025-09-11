using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_03
{
    internal class Passaro : Animal
    {
        public Passaro(string nome, int idade, double peso) : base(nome, idade, peso)
        {
        }

        public override double CalcularVelocidade()
        {
            return 80;
        }

        public override string FazerSom()
        {
            return "Piu piu";
        }
        public override string Mover()
        {
            return "Voando pelas alturas";
        }

    }
}
