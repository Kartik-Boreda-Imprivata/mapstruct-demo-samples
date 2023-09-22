
package com.kartikvarma.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public abstract class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private LocalDateTime dateOfBirth;
    private List<Address> officeAddress;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", officeAddress=" + officeAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (age != user.age) return false;
        if (!Objects.equals(firstName, user.firstName)) return false;
        if (!Objects.equals(lastName, user.lastName)) return false;
        if (!Objects.equals(dateOfBirth, user.dateOfBirth)) return false;
        return Objects.equals(officeAddress, user.officeAddress);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (officeAddress != null ? officeAddress.hashCode() : 0);
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Address> getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(List<Address> officeAddress) {
        this.officeAddress = officeAddress;
    }
}
