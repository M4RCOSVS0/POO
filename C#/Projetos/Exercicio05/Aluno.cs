using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

namespace Exercicio05
{
    internal class Aluno
    {
        public string Nome;
        public double[] Notas = new double[3];

        private double NotaFinal()
        {
            return (Notas[0] + Notas[1] + Notas[2]);
        }

        public void Situacao()
        {
            Console.WriteLine($"NOTA FINAL = {NotaFinal().ToString("F2",CultureInfo.InvariantCulture)}");
            if(NotaFinal() >= 60)
            {
                Console.WriteLine("APROVADO");
            }
            else
            { 
                Console.WriteLine($"REPROVADO\nFALTARAM {(60-NotaFinal()).ToString("F2", CultureInfo.InvariantCulture)} PONTOS");
            }
        }

    }
}
