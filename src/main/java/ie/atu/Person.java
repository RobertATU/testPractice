package ie.atu;

public class Person {
    public static void main(String[] args) {
        System.out.println("Running Docker Image");
    }
    private String name, city,id;
    private int age, balance;

    public Person(String name,String city,String id,int age,int balance){
        setName(name);
        setCity(city);
        setAge(age);
        setBalance(balance);
        setId(id);

    }

    public void setCity(String city) {
        if(Character.isUpperCase(city.charAt(0))){this.city = city;}
        else{throw new IllegalArgumentException("Must begin with uppercase");}
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(int balance) {
        if(balance >= 10){this.balance = balance;}
        else{throw new IllegalArgumentException("Must be over 10");}
    }

    private void setName(String name) {
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getBalance() {
        return balance;
    }
}
