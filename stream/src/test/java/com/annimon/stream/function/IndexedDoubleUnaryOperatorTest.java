package com.annimon.stream.function;

import org.junit.Test;
import static com.annimon.stream.test.hamcrest.CommonMatcher.hasOnlyPrivateConstructors;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

/**
 * Tests {@link IndexedDoubleUnaryOperator}
 */
public class IndexedDoubleUnaryOperatorTest {

    @Test
    public void testWrap() {
        IndexedDoubleUnaryOperator identity = IndexedDoubleUnaryOperator.Util
                .wrap(DoubleUnaryOperator.Util.identity());

        assertThat(identity.applyAsDouble(1, 0.2), closeTo(0.2, 0.001));
    }

    @Test
    public void testPrivateUtilConstructor() {
        assertThat(IndexedDoubleUnaryOperator.Util.class, hasOnlyPrivateConstructors());
    }
}