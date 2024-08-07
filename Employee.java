public class Employee {
    private int serviceNumber;
    private int phoneNumber;
    private String name;
    private int experience;

    public Employee(int serviceNumber, int phoneNumber, String name, int experience) {
        this.serviceNumber = serviceNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "{ " + serviceNumber + " " + phoneNumber + " " + name + " " + experience + " }";
    }
}
