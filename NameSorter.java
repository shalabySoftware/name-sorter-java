//package com.example.namesorter;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java NameSorter <input-file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = "sorted-names-list.txt";

        try {
            List<String> names = Files.readAllLines(Paths.get(inputFile));

            // sort by last name, then by given names
            names.sort((a, b) -> {
                String[] aParts = a.split(" ");
                String[] bParts = b.split(" ");

                String aLast = aParts[aParts.length - 1];
                String bLast = bParts[bParts.length - 1];

                int lastCmp = aLast.compareToIgnoreCase(bLast);
                if (lastCmp != 0) return lastCmp;

                return a.compareToIgnoreCase(b);
            });

            // print to screen
            names.forEach(System.out::println);

            // write to file
            Files.write(Paths.get(outputFile), names);
            System.out.println("\nSorted names written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
