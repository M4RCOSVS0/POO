namespace Exercício01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Conta conta;
            Console.Write("Entre com o número da conta: ");
            string numero = Console.ReadLine();
            Console.Write("Entre o  titular da conta: ");
            string titular = Console.ReadLine();
            Console.Write("Haverá depósito inicial: ");
            string op = Console.ReadLine();
            if (op == "s") 
            {
                Console.Write("Entre o valor de depósito inicial: ");
                double deposito = double.Parse(Console.ReadLine());
                conta = new Conta(numero, titular, deposito);
            }
            else
            {
                conta = new Conta(numero, titular);
            }

            Console.WriteLine($"\nDados da conta:\n{conta}\n");

            Console.Write("Entre um valor de depósito: ");
            double depositar = double.Parse(Console.ReadLine());
            conta.Depositar(depositar);
            Console.WriteLine("Dados da conta atualizados:\n"+conta);

            Console.Write("\nEntre um valor para saque: ");
            var saque = double.Parse(Console.ReadLine());
            conta.Saque(saque);
            Console.WriteLine("Dados da conta atualizados:\n" + conta);


        }
    }
}
