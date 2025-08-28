public class L134_ConstructorAndThis {
    public static class Person{
        int age ;
        String name;

        void saysHi(){
            System.out.println(name+"["+age+"] says hi");
        }
        Person(){
            // CONSTRUCTOR  
        }
        Person(int age,String name){
            this.age=age;
            this.name=name; 
        }
    }
    public static void main(String[] args) {
        Person P1=new Person();
        P1.name="A";
        P1.age=19;
        P1.saysHi();

        Person P2=new Person(15,"Ankit");
        P2.saysHi();
     }
    
    

}
