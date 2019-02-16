package com.ma.ainak.util; 
import static org.junit.Assert.*; 
import java.text.ParseException;
import java.util.Date;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
    /**
     * Rigorous Test :-)
     * @throws ParseException 
     */
    @Test
    
    public void shouldAnswerWithTrue() throws ParseException 
    {
    	/*test 1 */
      
          Date d =  new Date();
        String output1 = Util.formatDate(d, "dd/MM/yyyy");
        assertEquals("11/02/2019", output1);
        
        
    	/* test 2*/
        Date output2 = Util.parseDate("11/02/2019", "dd/MM/yyyy");
        String datestring= Util.formatDate(output2, "dd/MM/yyyy");
        assertEquals("11/02/2019", datestring);
        
    }
    
}
