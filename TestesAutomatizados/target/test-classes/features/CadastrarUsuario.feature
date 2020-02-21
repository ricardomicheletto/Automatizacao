#language:pt
#encoding: UTF-8

@cadastrarUsuario
Funcionalidade: CadastrarUsuario

@cadastro
  Cenario: cadastrar usuario
    Quando eu acionar a aba admin
    E acionar o botao add
    E informar no campo employer name "Ricardo Junior"
    E informar no campo username "Manoel"
    E informar no campo password "#Gf44549540893"
    E informar no campo confirmar password "#Gf44549540893"
    E acionar o botao salvar
    Entao o sistema cadastra o usuario "Manoel"