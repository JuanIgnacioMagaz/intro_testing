public class LastZeroFixed
{
/**
* Find LAST index of zero
*
* @param x array to search
* @return index of last 0 in x; -1 if absent
* @throws NullPointerException if x is null
*/
	public static int lastZeroFixed (int[] x)
	{
		int lastPos = -1;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == 0)
			{
				lastPos = i;
			}
		}
		return lastPos;
	}
}
