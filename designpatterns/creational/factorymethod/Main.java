package designpatterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        PolygonFactory polygonFactory = new PolygonFactory();
        for (int i = 3; i <= 8; i++) {
           try {
               if(i == 6) {
                   System.out.println("this is 6 sides polygon it has no name");
               }
               System.out.println(polygonFactory.getPolygon(i).getType());
           } catch (NullPointerException e) {
               System.out.println("nothing");
           }
        }
    }
}
