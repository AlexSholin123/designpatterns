package designpatterns.creational.builder;

public class Shop {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setRam(2)
                .setProcessor("QualComm")
                .setScreenSize(5.5)
                .setBattery(3100)
                .getPhone();

        System.out.println(phone);
    }
}
