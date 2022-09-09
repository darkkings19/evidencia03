import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class palindromosTest {
    private String[] palabrasIngresadas;
    private boolean [] resultadosEsperados;

    @BeforeEach
    public void init(){
        palabrasIngresadas = new String [] {"200", "", "aaabccbaaa","ahabccbaaa", "la tele letal"};
        resultadosEsperados = new boolean[]{false, true, true, false, true};
    }
    @Test
    public void esPalindromo(){
        for (int i = 0; i < palabrasIngresadas.length; i++) {
            boolean resutadoObtenido = palindromos.esPalindromo(palabrasIngresadas[i]);
            assertEquals(resutadoObtenido, resultadosEsperados[i]);
        }
    }

}