package BasicProgram;

public class InnerClass {
    public static void main(String[] args) {

        Person p=new Person();
        p.show();

        Person.Address ad=p.new Address();  //Object creation of inner non-static class
        ad.disp();

        Person.VillageInfo si=new Person.VillageInfo();//Object creation of inner static class
        si.villageInfo1();
    }
}
class Person{
    Address ad=new Address();
    void show()
    {
        System.out.println("User city = "+ ad.city);
        System.out.println("User pincode = "+ ad.pincode);
        System.out.println("User flat Number = "+ad.flatNo);
    }
    class Address{      //InnerClass
        int pincode=444503;
        String flatNo="08";
        String city="Chh.Sambhajinagar";
        void disp()
        {
            System.out.println("Inner non-static class");
        }

    }

    static class VillageInfo{
        void villageInfo1()
        {
            String vn="Kalamebeshor";
            System.out.println("Village Name is = "+vn);

        }
    }
}
