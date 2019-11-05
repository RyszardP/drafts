package rnds;

import java.time.LocalDate;

import java.util.concurrent.ThreadLocalRandom;

public class Rands {

    public static void main(String[] args) {


        LocalDate startDate = LocalDate.of(1990, 1, 1); //start date
        long start = startDate.toEpochDay();
        System.out.println(start);

        LocalDate endDate = LocalDate.now(); //end date
        long end = endDate.toEpochDay();
        System.out.println(start);

        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        System.out.println(LocalDate.ofEpochDay(randomEpochDay)); // random date between the range
    }
}
