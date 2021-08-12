//package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }



    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }



    //brackets in wrong order with text ] asddafsf [ should return false
    @Test
    public void bracketsWrongOrderNoTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


    @Test
    public void pleaseWerk() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][[]]]"));
    }


    //brackets in wrong order with text ] asddafsf [ should return false
    @Test
    public void bracketsWrongOrderWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]balasdf["));
    }


    //empty or no brackets should return true
    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }



    //only one bracket [ should return false
    @Test
    public void onlyOneBracketRightReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }



    //only one bracket ] should return false
    @Test
    public void onlyOneBracketLeftReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }



    //only one bracket [ with text should return false
    @Test
    public void onlyOneBracketWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[asdf"));
    }


    @Test
    public void onlyOneBracketWithTextReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("sdf]"));
    }


    //[ text ] should return true
    @Test
    public void correctFacingWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ asdfasdf ]"));
    }



    // text [] is true
    @Test
    public void correctFacingWithTextInFrontReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("aasdf[ ]"));
    }


    @Test
    public void correctFacingWithTextIntermittedlyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

}
