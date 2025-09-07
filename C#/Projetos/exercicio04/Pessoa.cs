using System.Globalization;

namespace exercicio04
{
    internal class Pessoa
    {
        public string Nome;
        public double SalarioBruto;
        public double Imposto;


        public double SalarioLiquido()
        {
            return SalarioBruto - Imposto;
        }

        public double AumentarSalario(double pct)
        {

            SalarioBruto *= pct / 100 + 1;
            return SalarioBruto;
        }

        public override string ToString()
        {
            return $"{Nome},$ {SalarioLiquido().ToString("F2",CultureInfo.InvariantCulture)}";
        }
    }
}
