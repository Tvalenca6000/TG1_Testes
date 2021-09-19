package tg1;

/*
 F.A.S.T
 Thiago Valença Corrêa - 31885731
 Vinícius Gomes Pajaro Grande - 31818201
 Gustavo Paulino Alkas - 41623215

 */
public class Varia_ano {
    public String Verifica_Ano(int x){
        int ano = x;
        String teste;
        if( (ano < 1900) || (ano > 2020) ){
            teste = "Data Inválida";
        }else{
            teste = "Data Valida";
        }
        System.out.println(x);
        return teste;
    }
}
