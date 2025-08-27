public class L132_SwapGame1 {
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
        Swap(P1, P2);
        P1.saysHi();
        P2.saysHi();
    }
    
    public static void Swap(Person p1,Person p2)
    {
        Person temp =p1;
        p1=p2;
        p2=temp;

    }

}
