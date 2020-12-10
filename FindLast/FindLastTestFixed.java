import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTestFixed
{
   // this test passes
   @Test public void lastPositionElement()
   {
      int arr[] = {2, 7, 0};
      int num = 0;
      assertEquals("In last position", 2, FindLastFixed.findLastFixed(arr, num));
   }

    // this test passes
   @Test public void middlePositionElement()
   {
	   int arr[] = {2, 7, 0};
           int num = 7;
      assertEquals("Middle Position", 1, FindLastFixed.findLastFixed(arr, num));
   }

   // this test passes
  @Test public void noElement()
  {
  	int arr[] = {2, 7, 0};
  	int num = 3;
     assertEquals("No Element", -1, FindLastFixed.findLastFixed(arr, num));
  }

   // this test fails (First Position expected:<0> but was:<-1>)
   // el bucle for no llega a iterar hasta la primera posición del array.
   @Test public void firstPositionElement()
   {
 	  int arr[] = {2, 7, 0};
 	  int num = 2;
      assertEquals("First Position", 0, FindLastFixed.findLastFixed(arr, num));
   }
}
