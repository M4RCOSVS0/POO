using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Atividade_exception.Entities.Exceptions;
namespace Atividade_exception.Entities
{
    internal class Account
    {
        public Account(int number, string holder, double balance, double withdrawLimit)
        {
            Number = number;
            Holder = holder;
            Balance = balance;
            WithdrawLimit = withdrawLimit;
        }

        public int Number { get; set; }//numero
        public string Holder { get; set; }//titular
        public double Balance { get; set; }//saldo
        public double WithdrawLimit { get; set; }//Limit saque

        public void Deposit(double amount)//depositar
        {
            Balance += amount;
        }

        public void Withdraw(double amount)//sacar
        {
            if(amount > WithdrawLimit)
            {
                throw new DomainException("The amount exceeds withdraw limit");
            }
            if (amount > Balance)
            {
                throw new DomainException("Not enough balance");
            }
            Balance -= amount;  
        }
    }
}
