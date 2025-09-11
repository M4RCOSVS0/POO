using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_03
{
    internal class Cachorro : Animal
    {
        public Cachorro(string nome, int idade, double peso) : base(nome, idade, peso)
        {
        }

        public override double CalcularVelocidade()
        {
            return Peso * 2;
        }

        public override string FazerSom()
        {
            return "AU AU AU"; 
        }
        public override string Mover()
        {
            return "Correndo com as 4 patas";
        }

    }
}
