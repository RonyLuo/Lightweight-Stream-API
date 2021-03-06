package com.annimon.stream.streamtests;

import com.annimon.stream.Stream;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public final class EqualsOnlyTest {

    @Test
    public void testEqualsOnly() {
        List<String> match = Stream.of("a", "b", "c")
                .equalsOnly("b")
                .toList();
        assertEquals(1, match.size());
        assertEquals("b", match.get(0));
    }
}
