public class L132_SwapGame2 {
    public static class Person{
        int age ;
        String name;

        void saysHi(){
            System.out.println(name+"["+age+"] says hi");
        }
    }
    public static void main(String[] args) {
        Person P1=new Person();
        Person P2=new Person();
        P1.name="A";
        P1.age=19;
        
        P2.name="B";
        P2.age=120;

        P1.saysHi();
        P2.saysHi();
        Swap2(P1, P2);
        P1.saysHi();
        P2.saysHi();
    }
    
    public static void Swap2(Person p1,Person p2)
    {
       int age=p1.age;
       p1.age=p2.age;
       p2.age=age;

       String name=p1.name;
       p1.name=p2.name;
       p2.name=name;

    }

}
