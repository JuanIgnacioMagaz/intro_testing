import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest
{
   // this test passes
   @Test public void lastPositionElement()
   {
      int arr[] = {2, 7, 0};
      assertEquals("Not in last position", 2, LastZero.lastZero(arr));
   }

    // this test passes
   @Test public void nonZeroElement()
   {
      int arr[] = {7, 2, -1};
      assertEquals("There is a 0", -1, LastZero.lastZero(arr));
   }

   // this test fails (There is a 0 expected:<2> but was:<0>)
   // se queda con el primer 0, no con el ultimo.
  @Test public void twoZeros()
  {
     int arr[] = {0, 2, 0};
     assertEquals("There is a 0", 2, LastZero.lastZero(arr));
  }
}
