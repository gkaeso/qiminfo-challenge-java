package qiminfo.test;

import org.junit.jupiter.api.Test;
import qiminfo.Main;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    TestMain() {}

    @Test
    void testInitSequenceSize() {
        int[][] sequences = Main.initSequences(3);
        assertArrayEquals(sequences[0], new int[] {0,1,0});
        assertArrayEquals(sequences[1], new int[] {1,0,1});

        sequences = Main.initSequences(7);
        assertArrayEquals(sequences[0], new int[] {0,1,0,1,0,1,0});
        assertArrayEquals(sequences[1], new int[] {1,0,1,0,1,0,1});

        sequences = Main.initSequences(10);
        assertArrayEquals(sequences[0], new int[] {0,1,0,1,0,1,0,1,0,1});
        assertArrayEquals(sequences[1], new int[] {1,0,1,0,1,0,1,0,1,0});
    }

    @Test
    void testGetDifference() {
        assertEquals(Main.getDifference(new int[] {1,1,1}, new int[] {0,1,0}), 2);
        assertEquals(Main.getDifference(new int[] {1,1,1}, new int[] {1,0,1}), 1);

        assertEquals(Main.getDifference(new int[] {1,1,0,1,0}, new int[] {0,1,0,1,0}), 1);
        assertEquals(Main.getDifference(new int[] {1,1,0,1,0}, new int[] {1,0,1,0,1}), 4);

        assertEquals(Main.getDifference(new int[] {1,1,0,1,0,0,0}, new int[] {0,1,0,1,0,1,0}), 2);
        assertEquals(Main.getDifference(new int[] {1,1,0,1,0,0,0}, new int[] {1,0,1,0,1,0,1}), 5);
    }

    @Test
    void testGetMinCoinSwap() {
        assertEquals(Main.getMinCoinSwap(new int[] {1,1,1}), 1);
        assertEquals(Main.getMinCoinSwap(new int[] {1,1,0,1,0}), 1);
        assertEquals(Main.getMinCoinSwap(new int[] {1,1,0,1,0,0,0}), 2);
    }

}
