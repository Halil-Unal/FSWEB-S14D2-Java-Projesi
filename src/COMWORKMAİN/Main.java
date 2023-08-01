package COMWORKMAİN;

import COMWORKMODEL.*;

public class Main {
    public static void main(String[] args) {
        Lamp lamp=new Lamp(LampType.LEON,true,56);
        Carpet carp=new Carpet(5,6, PaintColor.WHİTE);
        Ceiling ceil=new Ceiling(8,PaintColor.BLACK);
        Bed bed =new Bed("NİCE",4,5,6,7);
        Wall wall=new Wall("UP");
        Wardrobe war=new Wardrobe(8,1,3.78);
        int he=war.getHeight();
        Bedroom beds = new Bedroom(
                "ali",
                wall,
                wall,
                wall,
                wall,
                ceil,
                bed,
                war,
                carp
        );
        System.out.println(beds);
beds.getCeiling().create();
beds.getWardrobe().add();
beds.getCarpet().lying();
    }


}