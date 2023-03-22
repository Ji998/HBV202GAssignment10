package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.MultiplyComposite;
import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf;
import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.PlusComposite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MixedCompositeObserverTest {

	@Test
	public void testMixedPlusMultiplyCompositesObserver() {
is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf number1 = new is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf(1);
		is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf number2 = new is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf(2);
		is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf number4 = new is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf(4);

		is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(new NumberLeaf(3));

		number1.attach(plusComposite::getLastObservedResult);
		number2.attach(multiplyComposite::getLastObservedResult);
		number4.attach(multiplyComposite::getLastObservedResult);

		number1.setValue(3); // This will cause stuff printed on the screen: this is not tested.

		assertEquals(20, multiplyComposite.getLastObservedResult());
	}

}
