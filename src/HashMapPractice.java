import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> happy = new HashMap<>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy); //{a=10, b=3, c=88}
        System.out.println(happy.get("c")); //88

        HashMap<String, String> fun = new HashMap<>();
        fun.put("bobbyJoe1990", "p455w0rd");
        fun.put("helloKittyFan21", "catsG4l0r3");
        fun.put("coolGuySwag", "FluffyP0n135");

        System.out.println(fun.containsValue("p455w0rd")); //true
        System.out.println(fun.containsKey("h3110")); //false
        fun.replace("bobbyJoe1990", "b3tt3rP@55w0rd");

        System.out.println(fun); //{helloKittyFan21=catsG4l0r3, bobbyJoe1990=b3tt3rP@55w0rd, coolGuySwag=FluffyP0n135}

        //NOTE: HASHMAPS DONT HAVE AN ORDER
            //keys and values

        System.out.println(fun.keySet()); //[helloKittyFan21, bobbyJoe1990, coolGuySwag]
        System.out.println(fun.values()); //[catsG4l0r3, b3tt3rP@55w0rd, FluffyP0n135]
    }
}
