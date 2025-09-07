using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

namespace Exercício01
{
    internal class Conta
    {
        public static double taxa = 5.0;
        public string Nconta { get; private set; }
        public string Titular { get; private set; }
        public double Deposito { get; private set; }

        public Conta(string nconta, string titular, double deposito)
        {
            Nconta = nconta;
            Titular = titular;
            Deposito = deposito;
        }

        public Conta(string nconta, string titular)
        {
            Nconta = nconta;
            Titular = titular;
        }

        public void Depositar(double deposito)
        {
            Deposito += deposito;
        }

        public void Saque(double saque)
        {
            Deposito -= saque + taxa;
        }

        public override string ToString()
        {
            return $"Conta {Nconta}, Titular: {Titular}, Saldo: $ {Deposito.ToString("F2",CultureInfo.InvariantCulture)} ";
        }


    }
}
