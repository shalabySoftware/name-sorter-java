// Removed here for simplicity
//package com.assessment.namesorter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class NameSorterTest {

    @Test
    public void testSorting() {
        List<String> names = Arrays.asList(
                "Janet Parsons",
                "Vaughn Lewis",
                "Adonis Julius Archer",
                "Shelby Nathan Yoder"
        );

        names.sort((a, b) -> {
            String[] aParts = a.split(" ");
            String[] bParts = b.split(" ");

            String aLast = aParts[aParts.length - 1];
            String bLast = bParts[bParts.length - 1];

            int lastCmp = aLast.compareToIgnoreCase(bLast);
            if (lastCmp != 0) return lastCmp;

            return a.compareToIgnoreCase(b);
        });

        assertEquals("Adonis Julius Archer", names.get(0));
        assertEquals("Vaughn Lewis", names.get(1));
        assertEquals("Janet Parsons", names.get(2));
        assertEquals("Shelby Nathan Yoder", names.get(3));
    }
}
