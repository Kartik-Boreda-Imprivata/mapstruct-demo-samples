
package com.kartikvarma.entity;

import java.util.Objects;


public class Contractor extends User {
    private String contractingCompanyName;

    public String getContractingCompanyName() {
        return contractingCompanyName;
    }

    public void setContractingCompanyName(String contractingCompanyName) {
        this.contractingCompanyName = contractingCompanyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Contractor that = (Contractor) o;

        return Objects.equals(contractingCompanyName, that.contractingCompanyName);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (contractingCompanyName != null ? contractingCompanyName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "contractingCompanyName='" + contractingCompanyName + '\'' +
                '}';
    }
}
