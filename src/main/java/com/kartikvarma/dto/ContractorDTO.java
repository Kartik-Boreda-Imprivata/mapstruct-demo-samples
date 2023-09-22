

package com.kartikvarma.dto;

import java.util.Objects;


public class ContractorDTO extends UserDTO {
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

        ContractorDTO that = (ContractorDTO) o;

        return Objects.equals(contractingCompanyName, that.contractingCompanyName);
    }

    @Override
    public int hashCode() {
        return contractingCompanyName != null ? contractingCompanyName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ContractorDTO{" +
                "contractingCompanyName='" + contractingCompanyName + '\'' +
                '}';
    }
}
