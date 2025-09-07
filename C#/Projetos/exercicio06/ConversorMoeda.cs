
namespace Exercicio06
{
    internal class ConversorMoeda
    {

        public static double Iof = 1.06; 

        public static double ConverteDolar(double valor,double qte)
        {
            return ((valor * qte) * Iof);
        }  
    }
}
