package com.example.namesorter;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void testSorting() {
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