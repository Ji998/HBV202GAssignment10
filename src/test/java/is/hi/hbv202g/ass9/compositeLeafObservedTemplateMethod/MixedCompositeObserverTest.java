package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import is.hi.hbv202g.ass9.CompositeMain;
import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.*;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MixedCompositeObserverTest {

	@Test
	public void testMixedPlusMultiplyCompositesObserver() {

		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(new NumberLeaf(3));

		number1.attach(plusComposite::getLastObservedResult);
		number2.attach(multiplyComposite::getLastObservedResult);
		number4.attach(multiplyComposite::getLastObservedResult);

		number1.setValue(3); // This will cause stuff printed on the screen: this is not tested.
	
		assertEquals(20, multiplyComposite.getLastObservedResult());
	}
}
