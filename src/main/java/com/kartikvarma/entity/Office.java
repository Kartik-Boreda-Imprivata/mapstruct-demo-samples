package com.kartikvarma.entity;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Office {


    private List<Employee> employees;
    private List<Contractor> contractors;

    public List<Employee> getEmployees() {
        return Collections.emptyList();
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Contractor> getContractors() {
        return Collections.emptyList();
    }

    public void setContractors(List<Contractor> contractors) {
        this.contractors = contractors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Office that = (Office) o;

        if (!Objects.equals(employees, that.employees)) return false;
        return Objects.equals(contractors, that.contractors);
    }

    @Override
    public int hashCode() {
        int result = employees != null ? employees.hashCode() : 0;
        result = 31 * result + (contractors != null ? contractors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Office{" +
                "employees=" + employees +
                ", contractors=" + contractors +
                '}';
    }
}
