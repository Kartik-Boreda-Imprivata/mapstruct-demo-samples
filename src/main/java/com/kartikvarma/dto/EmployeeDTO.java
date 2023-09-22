
package com.kartikvarma.dto;

import java.util.Objects;


public class EmployeeDTO extends UserDTO {
    private String designation;
    private EmployeeDTO reportingManager;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public EmployeeDTO getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(EmployeeDTO reportingManager) {
        this.reportingManager = reportingManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EmployeeDTO that = (EmployeeDTO) o;

        if (!Objects.equals(designation, that.designation)) return false;
        return Objects.equals(reportingManager, that.reportingManager);
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
        return "EmployeeDTO{" +
                "designation='" + designation + '\'' +
                ", reportingManager=" + reportingManager +
                '}';
    }
}
