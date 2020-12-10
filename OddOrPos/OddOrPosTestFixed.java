import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTestFixed
{
   // this test fails
   @Test public void oddNegativeElement()
   {
      int arr[] = {-5, 7, 3};
      assertEquals("Odd negative element", 3, OddOrPosFixed.oddOrPosFixed(arr));
   }
   // this test passes
   @Test public void allPositiveElements()
   {
      int arr[] = {2, 7, 3};
      assertEquals("All Positive Elements", 3, OddOrPosFixed.oddOrPosFixed(arr));
   }
   // this test passes
   @Test public void allZeroElements()
   {
      int arr[] = {0, 0, 0};
      assertEquals("All Zero Elements", 0, OddOrPosFixed.oddOrPosFixed(arr));
   }
}
