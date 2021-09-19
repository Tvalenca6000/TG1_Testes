package tg1;
/*
 F.A.S.T
 Thiago Valença Corrêa - 31885731
 Vinícius Gomes Pajaro Grande - 31818201
 Gustavo Paulino Alkas - 41623215

 */
public class Nota_bimestral {
    public String Verifica_Nota_Bimestral(int x){
        int nota = x;
        String teste;
        if( (nota < 0) || (nota > 10) ){
            teste = "Nota Inválida";
        }else{
            teste = "Nota Valida";
        }
        System.out.println(x);
        return teste;
    }
    
}
