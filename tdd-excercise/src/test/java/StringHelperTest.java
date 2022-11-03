import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    // AB -> BA
    // DLOCAL -> DLOCLA
    // D -> D
    // 12345 -> 12354
    // null -> null
    // "" -> ""

    StringHelper helper = new StringHelper();


    @Test
    public void stringBasicTest(){
        assertEquals("BA",helper.swapLastTwoCharacters("AB"));
    }

    @Test
    public void stringWithFourCharsTest(){
        assertEquals("DLOCLA",helper.swapLastTwoCharacters("DLOCAL"));
    }

    @Test
    public void stringWithOneCharTest(){
        assertEquals("A",helper.swapLastTwoCharacters("A"));
    }

    @Test
    public void stringWithNumbersTest(){
        assertEquals("12354",helper.swapLastTwoCharacters("12345"));
    }

    @Test
    public void stringWithNullCharTest(){
        assertEquals(null,helper.swapLastTwoCharacters(null));
    }

    @Test
    public void stringWithEmptyCharsTest(){
        assertEquals("",helper.swapLastTwoCharacters(""));
    }

}