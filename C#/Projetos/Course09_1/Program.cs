using Course09_1.Entities;
using System.Globalization;
namespace Course09_1
{
    internal class Program
    {
        static void Main(string[] args)
        {/*
            Account acc1 = new Account(1001,"Alex",500.0);
            Account acc2 = new SavingsAccount(1002, "Anna", 500.0, 0.01);

            
            
            // Acesso direto não permitido, gera erro:
            // Console.WriteLine(acc2.InterestRate);

            // Acesso permitido com cast:
            SavingsAccount sa = (SavingsAccount)acc2;
            Console.WriteLine(sa.InterestRate); // Mostra 0.01
            

            acc1.Withdraw(10.0);
            acc2.Withdraw(10.0);

            Console.WriteLine(acc1.Balance);
            Console.WriteLine(acc2.Balance);*/

            List<Account> list = new List<Account>();

            list.Add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
            list.Add(new BusinessAccount(1002, "Alexa", 500.0, 400.0));
            list.Add(new SavingsAccount(1003, "Bob", 500.0, 0.01));
            list.Add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

            double sum = 0.0;
            foreach (Account account in list)
            {
                sum += account.Balance;
            }

            Console.WriteLine("Total balance: "+sum.ToString("F2",CultureInfo.InvariantCulture));

            foreach (Account acc in list)
            {
                acc.Withdraw(10);
            }

            foreach (Account acc in list)
            {
                Console.WriteLine("Update balance for account "+ acc.Number + ": " + acc.Balance.ToString("F2", CultureInfo.InvariantCulture));
            }
        }
    }
}
