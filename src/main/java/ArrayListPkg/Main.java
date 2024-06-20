package ArrayListPkg;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       // System.out.println("Enter the size of ArrayList: ");
        String input;
        int number;
        while(true) {
            try {
                System.out.println("Enter the size of ArrayList: ");
                input = scanner.nextLine();
                number = Integer.parseInt(input);
                if (number < 0) System.out.println("the input must be greater than 0 : ");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Your input is invalid!!!  Plz Enter the number!!");
            }
        }
        //fill ArrayList
        fillArrayList(list, number, random);
        System.out.println("before: ");
        System.out.println(list);
        //remove incorrect Couple
        System.out.println("After remove: ");
        incorrectCouple(list);
        System.out.println(list);

    }

    public static ArrayList<Integer> incorrectCouple(ArrayList<Integer> list) {
        if (list.size() % 2 != 0) list.remove(list.size() - 1);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) < list.get(i + 1)) {
                list.remove(i);
                list.remove(i);
            } else i += 2;
        }
        return list;
    }

    public static ArrayList<Integer> fillArrayList(ArrayList<Integer> list, int number, Random random) {
        for (int i = 0; i < number; i++) {
            list.add(random.nextInt(0, 10));
        }
        return list;
    }
}
/*        //pass empty list
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("before: ");
        System.out.println(list2);
        //remove incorrect Couple
        System.out.println("After remove: ");
        incorrectCouple(list2);
        System.out.println(list2);*/

       /*
         //{1 ,3 ,7 ,4 ,3 ,6 ,5 }
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(list.size() - 1));
        list.remove(list.size() - 1);
        System.out.println(list);
        incorrectCouple(list);
        System.out.println(list);*/
