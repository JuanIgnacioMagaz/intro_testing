import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTest
{
   // this test fails(Odd negative element expected:<3> but was:<2>)
   @Test public void oddNegativeElement()
   {
      int arr[] = {-5, 7, 3};
      assertEquals("Odd negative element", 3, OddOrPos.oddOrPos(arr));
   }
   // this test passes
   @Test public void allPositiveElements()
   {
      int arr[] = {2, 7, 3};
      assertEquals("All Positive Elements", 3, OddOrPos.oddOrPos(arr));
   }
   // this test passes
   @Test public void allNegativeEvenElements()
   {
      int arr[] = {-2, -4, -6};
      assertEquals("All Negative Even Elements", 0, OddOrPos.oddOrPos(arr));
   }
   // this test passes
   @Test public void allZeroElements()
   {
      int arr[] = {0, 0, 0};
      assertEquals("All Zero Elements", 0, OddOrPos.oddOrPos(arr));
   }
}
