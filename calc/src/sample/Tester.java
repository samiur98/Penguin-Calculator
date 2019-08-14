package sample;


import java.util.HashMap;

import static javafx.application.Application.launch;

public class Tester {
    public static void tester() {

    }
    public static void main(String[] args){
        //GUI gui=new PenguinGUI();
        //gui.render();
        int x = 2;
        double y = 3.14567;
        Number z = x+y;
        //Integer o = (int) z;
        System.out.println(z.getClass());
        System.out.println(z);
        HashMap<String,Addition> map = new HashMap<>();
        //map.put("9", new Addition());
        //map.put("6",new Addition());
        Addition a = map.get("9");
        Addition b = map.get("9");
        Addition c = map.get("6");
        if (a == b){
            System.out.println("BVB");
        }
        else{
            System.out.println("Jag");
        }
        Double d = Double.parseDouble("2.5");
        System.out.println(Math.E/25);
        System.out.println(-0.8/0.0);
        System.out.println(Double.parseDouble("9.9"));

    }
}
