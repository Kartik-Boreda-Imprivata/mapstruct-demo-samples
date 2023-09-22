
package com.kartikvarma.entity;

import java.util.Objects;


public class Employee extends User {
    private String designation;
    private Employee reportingManager;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(Employee reportingManager) {
        this.reportingManager = reportingManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        if (!Objects.equals(designation, employee.designation))
            return false;
        return Objects.equals(reportingManager, employee.reportingManager);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        result = 31 * result + (reportingManager != null ? reportingManager.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "designation='" + designation + '\'' +
                ", reportingManager=" + reportingManager +
                '}';
    }
}
