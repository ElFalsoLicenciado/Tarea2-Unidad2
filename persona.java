public class persona {
    
    String name="";
    int age;

    public persona(String name, int age){
        this.name=name;
        this.age=age;
        Print();
    }


    public void Print(){
        System.out.println("Su nombre es "+name+" y tiene "+age+" años.");
    }

}
