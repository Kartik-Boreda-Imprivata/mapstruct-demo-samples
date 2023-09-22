package com.kartikvarma.dto;

import java.util.List;
import java.util.Objects;

public class HeadOfficeDTO {

    private List<EmployeeDTO> employees;
    private List<ContractorDTO> contractors;

    private long faxNumber;

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
    }

    public List<ContractorDTO> getContractors() {
        return contractors;
    }

    public void setContractors(List<ContractorDTO> contractors) {
        this.contractors = contractors;
    }

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(long faxNumber) {
        this.faxNumber = faxNumber;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeadOfficeDTO that = (HeadOfficeDTO) o;

        if (faxNumber != that.faxNumber) return false;
        if (!Objects.equals(employees, that.employees)) return false;
        return Objects.equals(contractors, that.contractors);
    }

    @Override
    public int hashCode() {
        int result = employees != null ? employees.hashCode() : 0;
        result = 31 * result + (contractors != null ? contractors.hashCode() : 0);
        result = 31 * result + (int) (faxNumber ^ (faxNumber >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "HeadOfficeDTO{" +
                "employees=" + employees +
                ", contractors=" + contractors +
                ", faxNumber=" + faxNumber +
                '}';
    }
}
