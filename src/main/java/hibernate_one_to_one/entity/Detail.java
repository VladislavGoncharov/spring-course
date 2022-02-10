package hibernate_one_to_one.entity;


import javax.persistence.*;

@Entity
@Table(name = "details")
public class Detail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "phone_number")
    private String phoneNumbers;
    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "empDetails")
    private Employee employee;

    public Detail(){

    }

    public Detail(String city, String phoneNumbers, String email) {
        this.city = city;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
