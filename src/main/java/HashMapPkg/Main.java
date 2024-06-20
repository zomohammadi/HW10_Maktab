package HashMapPkg;

public class Main {
    public static void main(String[] args) {
     /*   HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "zohre");
        map.put(2, "ahmad");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.isEmpty());
        System.out.println("-------------");
        List<String> list = new ArrayList<>();
        list.add("zohre");
        list.add("sahar");*/

        HashMapZohre<Integer, String> hashMapZohre = new HashMapZohre<Integer, String>();
        //isEmpty
        System.out.println("isEmpty: ");
        System.out.println(hashMapZohre.isEmpty());

        //put
        System.out.println("Add: ");
        hashMapZohre.put(1, "Sahar");
        hashMapZohre.put(2, "Shima");
        hashMapZohre.put(3, "Amin");
        hashMapZohre.put(4, "Mohammad");
        hashMapZohre.put(5, "Sahar");
        hashMapZohre.put(1, "Zohre");
        System.out.println(hashMapZohre);

        //containsKey
        System.out.println("containsKey: ");
        System.out.println(hashMapZohre.containsKey(2));
        System.out.println(hashMapZohre.containsKey(6));

        //getAllValues
        System.out.println("Get All Values: ");
        System.out.println(hashMapZohre.getAllValue());

        //replace 2 input
        System.out.println("replace 2 input: ");
        hashMapZohre.replace(2, "Hamid");
        System.out.println(hashMapZohre);

        //replace 3 input
        System.out.println("replace 3 input: ");
        hashMapZohre.replace(2, "Hamid", "Majid");
        System.out.println(hashMapZohre);

        //get
        System.out.println("get one Value");
        System.out.println(hashMapZohre.get(3));

        //remove
        System.out.println("remove: ");
        hashMapZohre.remove(2);
        System.out.println(hashMapZohre);

        //isEmpty
        System.out.println("isEmpty: ");
        System.out.println(hashMapZohre.isEmpty());

    }
}
