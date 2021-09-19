package tg1;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 F.A.S.T
 Thiago Valença Corrêa - 31885731
 Vinícius Gomes Pajaro Grande - 31818201
 Gustavo Paulino Alkas - 41623215

 */
public class Nota_bimestralTest {
    
    Nota_bimestral teste_nota;
    
    public Nota_bimestralTest() {
        teste_nota = new Nota_bimestral();
    }

    @Test
    public void Nota_Invalida() {
        System.out.println("Teste Nota inválida");
        assertEquals("Nota Inválida", teste_nota.Verifica_Nota_Bimestral(-30));
        assertEquals("Nota Inválida", teste_nota.Verifica_Nota_Bimestral(15));
    }
    
    @Test
    public void Nota_valida(){
        System.out.println("Teste Nota valida");
        assertEquals("Nota Valida", teste_nota.Verifica_Nota_Bimestral(8));
    }  
    
}
