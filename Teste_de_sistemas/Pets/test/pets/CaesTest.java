package pets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

//@author Gabrielle

public class CaesTest {
    Caes pedro;
    
    public CaesTest() {
        pedro = new Caes("Cachorrin", 15);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.print("Testando: ");
    }
    
    @After
    public void tearDown() {
        System.out.print("\n");
    }
    
    @Test
    public void testAndarAnimado(){
        System.out.println("Andar - Animado");
        assertEquals(pedro.andar(1000), true);
        System.out.println("Cálculo: Aprovado");
        assertEquals(pedro.humor, "animado");
        System.out.println("Humor: Aprovado");
    }
    
    @Test
    public void testAndarCansado(){
        System.out.println("Andar - Cansado");
        assertEquals(pedro.andar(2000), false);
        System.out.println("Cálculo: Aprovado");
        assertEquals(pedro.humor, "cansado");
        System.out.println("Humor: Aprovado");
    }
    
    @Test
    public void testComer(){
        System.out.println("Comer");
        float pesoInicial = pedro.peso;
        pedro.comer();
        float pesoFinal = pedro.peso;
        assertEquals(pesoFinal, pesoInicial + 0.01f, 0);
        System.out.println("Cálculo: Aprovado");
        assertEquals(pedro.humor, "satisfeito");
        System.out.println("Humor: Aprovado");
    }
    
    @Test
    public void testDormirAnimado(){
        System.out.println("Dormir - Animado");
        pedro.humor = "animado";
        assertEquals(pedro.dormir(), false);
        assertEquals(pedro.humor, "animado");
        System.out.println("Humor: Aprovado");
    }
    
    @Test
    public void testDormirCansado(){
        System.out.println("Dormir - Cansado");
        pedro.humor = "cansado";
        assertEquals(pedro.dormir(), true);
        assertEquals(pedro.humor, "animado");
        System.out.println("Humor: Aprovado");
    }

    /**
     * Test of falar method, of class Caes.
     */
    @Test
    public void testFalar() {
        System.out.println("falar");
        String mensagem = "";
        Caes dog = new Caes("pedro", 3);
        String expResult = "";
        String result = dog.falar(mensagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of andar method, of class Caes.
     */
    @Test
    public void testAndar() {
        System.out.println("andar");
        int num_passos = 0;
        Caes instance = null;
        boolean expResult = false;
        boolean result = instance.andar(num_passos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dormir method, of class Caes.
     */
    @Test
    public void testDormir() {
        System.out.println("dormir");
        Caes instance = null;
        boolean expResult = false;
        boolean result = instance.dormir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
