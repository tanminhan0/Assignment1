package ie.atu.Assignment1;

public class Passenger {
    private String title, name, id, phone;
    private int age;


    public Passenger(String title, String name, String id, String phone, int age){
        this.title = title;
        this.name =name;
        this.id = id;
        this.phone = phone;
        this.age = age;


    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setTitle(String title) {
        //Check Title
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("This is not a valid title");
        }

    }

    public void setName(String name) {
        //Check name length
        if(name.length() >= 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name must be greater than 3 characters");
        }

    }

    public void setId(String id) {
        //Check ID length
        if(id.length() >= 10){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("ID length must be greater than 10 characters");
        }
    }

    public void setPhone(String phone) {
        //Check Phone Numbers length
        if(phone.length() >= 7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone must be greater than 7 numbers");
        }
    }

    public void setAge(int age) {
        //Check Age eligibility to fly
        if(age >= 16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Age below 16 is too young to fly");
        }
    }
}
