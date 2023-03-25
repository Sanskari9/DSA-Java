public class Constructor {
    static class Employee{
        String name;
        int id;
        Employee(String name){
            this.name = name;
        }
        Employee(String name, int id){
            this.name = name;
            this.id = id;
        }
       public void print(){
        System.out.println(name+" "+id);
       }
    }
    public static void main(String [] args){
        Employee E1 = new Employee("Santosh");
        Employee E2 = new Employee("Rajmal", 10);
        E1.print();
        E2.print();
    }
}
