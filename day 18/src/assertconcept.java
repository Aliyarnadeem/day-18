import org.junit.Test;
import static org.junit.Assert.*;

public class assertconcept {

   @Test
   public void assertconcept() {
      //test data
      String str1 = new String ("nadeem");
      String str2 = new String ("nadeem");
      String str3 = null;
      String str4 = "aliyar";
      String str5 = "aliyar";
		
      int val1 = 1;
      int val2 = 2;

      String[] expectedArray = {"one", "two", "three"};
      String[] resultArray =  {"one", "two", "three"};

      //Check that two objects are equal
      assertEquals(str1, str2);

      //Check that a condition is true
      assertTrue (val1 < val2);

      //Check that a condition is false
      assertFalse(val1 > val2);

      //Check that an object isn't null
      assertNotNull(str1);

      //Check that an object is null
      assertNull(str3);

      //Check if two object references point to the same object
      assertSame(str4,str5);

      //Check if two object references not point to the same object
      assertNotSame(str1,str3);

      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
   }
}