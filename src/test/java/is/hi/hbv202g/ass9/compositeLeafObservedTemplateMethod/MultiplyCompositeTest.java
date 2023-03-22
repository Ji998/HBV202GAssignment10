package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import org.junit.Before;
import org.junit.Test;
import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.*;

import static org.junit.Assert.assertEquals;

public class MultiplyCompositeTest {

	private MultiplyComposite multiplyComposite;

	@Before
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyComposite();
	}

	@Test
	public void testOneElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);

		multiplyComposite.add(number2);
		assert (multiplyComposite.getLastObservedResult() == 2);
	}

	public void testTwoElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		multiplyComposite.add(number2);
		multiplyComposite.add(number4);
		assertEquals(8, multiplyComposite.getLastObservedResult());
	}

	public void testNestedMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		multiplyComposite.add(number2);
		multiplyComposite.add(number4);

		MultiplyComposite multiplyComposite2 = new MultiplyComposite();
		multiplyComposite2.add(number2);
		multiplyComposite2.add(number4);
		assertEquals(64, multiplyComposite.getLastObservedResult());
	}

	
}
