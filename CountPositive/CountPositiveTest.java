import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest
{
   // this test passes
   @Test public void nonNegativeElement()
   {
      int arr[] = {2, 7, 0};
      assertEquals("Non negative element", 3, CountPositive.countPositive(arr));
   }

    // this test passes
   @Test public void negativeElement()
   {
      int arr[] = {7, 2, -1};
      assertEquals("Negative element", 2, CountPositive.countPositive(arr));
   }
}
