public class Main {
    public static void main(String[] args) {
        Employee josh = new Employee(1001,8777545,"Josh",3);
        Employee sarah = new Employee(1002,499555,"Sarah",2);
        Employee michael = new Employee(1003,789455,"Michael",5);
        Employee ryan = new Employee(1004,875547,"Ryan",3);
        EmployeeDirectory dictionary = new EmployeeDirectory();
        dictionary.addEmployee(1005,875547,"Elithabet",4);
        dictionary.addEmployee(josh);
        dictionary.addEmployee(sarah);
        dictionary.addEmployee(michael);
        dictionary.addEmployee(ryan);
        System.out.println("Search by experience: ");
        System.out.println("Found: "+dictionary.findEmployeeByExperience(3));
        System.out.println();
        System.out.println("Search by phoneNumber");
        System.out.println("Found: "+ dictionary.findByPhoneNumber(875547));
        System.out.println();
        System.out.println("Search by Service number: ");
        System.out.println(dictionary.findByServiceNumber(1003));
        System.out.println();
        System.out.println(dictionary.getDictionarySize());
        System.out.println("All employees in dictionary");
        System.out.println(dictionary.showAll());
    }
}
