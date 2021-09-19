package tg1;

/*
 F.A.S.T
 Thiago Valença Corrêa - 31885731
 Vinícius Gomes Pajaro Grande - 31818201
 Gustavo Paulino Alkas - 41623215

 */
public class Motorista {
    public String Verifica_Motorista(int x){
        int idade = x;
        String teste;
        if( (idade < 0) || (idade > 150) ){
            teste = "Inválido";
        }else if(idade < 50){
            teste = "Renovação 10 anos";
        }else if( (idade > 50) && (idade < 70) ){
            teste = "Renovação 5 anos";
        }else{
            teste = "Renovação 3 anos";
        }
        System.out.println(x);
        return teste;
    }
}
