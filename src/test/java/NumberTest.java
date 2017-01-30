import Numbers.Numbers;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberTest 
{
	@Test
	public void testTri4()
	{
		assertEquals(Numbers.TriNum(4), 10);
	}
	
	@Test
	public void testTri7()
	{
		assertEquals(Numbers.TriNum(7), 28);
	}
	
	@Test
	public void testTri1()
	{
		assertEquals(Numbers.TriNum(1), 1);
	}
	
	@Test
	public void testCat3()
	{
		assertEquals(Numbers.Caterer(3), 7);
	}
	
	@Test
	public void testCat6()
	{
		assertEquals(Numbers.Caterer(6), 22);
	}
	
	@Test
	public void testCat9()
	{
		assertEquals(Numbers.Caterer(9), 46);
	}
}
