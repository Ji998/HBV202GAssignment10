package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusCompositeTest {

	private PlusComposite plusComposite;

	@Before
	public void createPlusComposite() {
		plusComposite = new PlusComposite();
	}

	@Test
	public void testEmptyPlusComposite() {
		assertEquals(0, plusComposite.getLastObservedResult());
	}

	@Test
	public void testOneElementPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);

		plusComposite.add(number1);
		assertEquals(1, plusComposite.getLastObservedResult());
	}

	@Test
	public void testTwoElementPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);

		plusComposite.add(number1);
		plusComposite.add(number2);
		assertEquals(3, plusComposite.getLastObservedResult());
	}

	@Test
	public void testNestedPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);

		plusComposite.add(number1);
		plusComposite.add(number2);

		PlusComposite plusComposite2 = new PlusComposite();
		plusComposite2.add(number1);
		plusComposite2.add(number2);

		assertEquals(6, plusComposite2.getLastObservedResult());
	}

}
