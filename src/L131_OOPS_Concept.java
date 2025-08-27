public class L131_OOPS_Concept {
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
        P1.saysHi();


        P2.name="B";
        P2.age=120;
        P2.saysHi();
    }

}
