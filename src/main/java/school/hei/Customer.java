package school.hei;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private String email;
    private String phone;

    public Customer(String name, String lastName, LocalDate birthDate, String address, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
