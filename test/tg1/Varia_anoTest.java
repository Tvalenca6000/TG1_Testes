package tg1;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 F.A.S.T
 Thiago Valença Corrêa - 31885731
 Vinícius Gomes Pajaro Grande - 31818201
 Gustavo Paulino Alkas - 41623215

 */
public class Varia_anoTest {
    
    Varia_ano teste_ano;
    
    public Varia_anoTest() {
        teste_ano = new Varia_ano();
    }

    @Test
    public void Varia_Ano_Data_Invalida() {
        System.out.println("Teste Data inválida");
        assertEquals("Data Inválida", teste_ano.Verifica_Ano(1890));
        assertEquals("Data Inválida", teste_ano.Verifica_Ano(2025));
    }
    
    @Test
    public void Varia_Ano_Data_Valida() {
        System.out.println("Teste Data valida");
        assertEquals("Data Valida", teste_ano.Verifica_Ano(1910));
        assertEquals("Data Valida", teste_ano.Verifica_Ano(2020));
    }  
    
}
