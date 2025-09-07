using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_Vetor
{
    internal class ClientePousada
    {
        public string Nome { get; set; }
        public string Email { get; set;}

        public ClientePousada(string nome, string email)
        {
            Nome = nome;
            Email = email;
        }
    }
}
