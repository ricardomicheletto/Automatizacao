#language:pt
#encoding: UTF-8

@login
Funcionalidade: Login

  Cenario: usuario invalido
    Quando eu informar o usuario "Ad"
    E informar a senha "asd"
    E clicar no botao login
    Entao o sistema exibe a mensagem de usuario invalido

@loginSucesso
  Cenario: realizar login
    Quando eu informar o usuario "Admin"
    E informar a senha "@wwZu@@STR26"
    E clicar no botao login
    Entao o sistema exibe o usuario logado
    