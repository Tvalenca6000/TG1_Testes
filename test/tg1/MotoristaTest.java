package tg1;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 F.A.S.T
 Thiago Valença Corrêa - 31885731
 Vinícius Gomes Pajaro Grande - 31818201
 Gustavo Paulino Alkas - 41623215

 */
public class MotoristaTest {
    
    Motorista teste_idade;
    
    public MotoristaTest() {
        teste_idade = new Motorista();
    }

    @Test
    public void Idade_Invalido() {
        System.out.println("Teste Entrada inválida");
        assertEquals("Inválido", teste_idade.Verifica_Motorista(-20));
        assertEquals("Inválido", teste_idade.Verifica_Motorista(2000));
    }
    
    @Test
    public void Idade_valida_10_anos(){
        System.out.println("Teste 10 anos valida");
        assertEquals("Renovação 10 anos", teste_idade.Verifica_Motorista(45));
    }  
 
    @Test
    public void Idade_valida_5_anos(){
        System.out.println("Teste 5 valida");
        assertEquals("Renovação 5 anos", teste_idade.Verifica_Motorista(62));
        assertEquals("Renovação 5 anos", teste_idade.Verifica_Motorista(69));
    }  

    @Test
    public void Idade_valida_3_anos(){
        System.out.println("Teste 3 valida");
        assertEquals("Renovação 3 anos", teste_idade.Verifica_Motorista(89));
    }  
}
