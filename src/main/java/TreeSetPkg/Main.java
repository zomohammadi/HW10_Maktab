package TreeSetPkg;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Character> treeSetFirst = new TreeSet<Character>();
        Set<Character> treeSetSecond = new TreeSet<Character>();

        Random random = new Random();

        int sizeOfCollection = 10;
        fillTreeSet(treeSetFirst, random, sizeOfCollection);
        fillTreeSet(treeSetSecond, random, sizeOfCollection);

        repeat(treeSetFirst, random, sizeOfCollection);
        repeat(treeSetSecond, random, sizeOfCollection);

        System.out.println(treeSetFirst);
        System.out.println(treeSetSecond);

        //Union
        System.out.println("Union");
        System.out.println(union(treeSetFirst, treeSetSecond));

        //subscribe
        System.out.println("Subscribe");
        System.out.println(subscribe(treeSetFirst, treeSetSecond));

    }

    public static Set<Character> fillTreeSet(Set<Character> treeSet, Random random, int sizeOfCollection) {
        for (int i = 0; i < sizeOfCollection; i++) {
            char rond1 = (char) ('a' + random.nextInt(26));
            treeSet.add(rond1);
        }
        return treeSet;
    }

    public static void repeat(Set<Character> treeSet, Random random, int sizeOfCollection) {
        if (treeSet.size() != sizeOfCollection) {
            while (10 - treeSet.size() > 0) {
                char rand2 = (char) ('a' + random.nextInt(26));
                treeSet.add(rand2);
            }
        }
    }

    public static Set<Character> union(Set<Character> treeSetFirst, Set<Character> treeSetSecond) {
        Set<Character> treeSetThird = new TreeSet<Character>();
        treeSetThird.addAll(treeSetFirst);
        treeSetThird.addAll(treeSetSecond);

        return treeSetThird;
    }

    public static Set<Character> subscribe(Set<Character> treeSetFirst, Set<Character> treeSetSecond) {
        Set<Character> treeSetThird = new TreeSet<Character>();
        for (Character firstChar : treeSetFirst) {
            for (Character secondChar : treeSetSecond) {
                if (firstChar == secondChar) {
                    treeSetThird.add(firstChar);
                    break;
                }
            }
        }
        return treeSetThird;
    }
}

