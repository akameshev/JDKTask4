import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> dictionary;
    private int dictionarySize;

    public EmployeeDirectory() {
        dictionary = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        dictionary.add(employee);
        dictionarySize++;
    }

    public void addEmployee(int serviceNumber, int phoneNumber, String name, int experience) {
        dictionary.add(new Employee(serviceNumber, phoneNumber, name, experience));
        dictionarySize++;
    }

    public void showDictionary() {
        for (Employee employee : dictionary) {
            System.out.println(employee.toString());
        }
    }

    public List<Employee> findEmployeeByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : dictionary) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> showAll() {
        return dictionary;
    }

    public List<Employee> findByPhoneNumber(int phoneNumber) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : dictionary) {
            if (employee.getPhoneNumber() == phoneNumber) {
                result.add(employee);
            }
        }
        return result;
    }
    public Employee findByServiceNumber(int serviceNumber){
        for (Employee employee:dictionary){
            if (employee.getServiceNumber()==serviceNumber){
                return employee;
            }
        }
        return null;
    }
    public int getDictionarySize(){
        return dictionarySize;
    }
}
