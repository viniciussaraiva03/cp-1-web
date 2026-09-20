// Sistema de Cadastro de Vinhos - Vinheira

// Array que vai guardar todos os vinhos cadastrados
let vinhos = [];

// Função principal de cadastro
function cadastrarVinho() {
  // 1. Coleta das informações usando prompt()
  var nome = prompt("Digite o nome do vinho:");

  var tipo = prompt("Digite o tipo do vinho:");

  var safra = prompt("Digite a safra do vinho:");

  var quantidade = prompt("Digite a quantidade em estoque:");
}

  quantidade = parseInt(quantidade);

  var vinho = {
    nome: nome,
    tipo: tipo,
    safra: safra,
    quantidade: quantidade
  };    

   alert("Cadastro realizado! Veja os detalhes no console.");

