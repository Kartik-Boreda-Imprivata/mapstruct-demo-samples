package com.kartikvarma.entity;

public class HeadOffice extends Office {

    private long faxNumber;

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
        if (!super.equals(o)) return false;

        HeadOffice that = (HeadOffice) o;

        return faxNumber == that.faxNumber;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (faxNumber ^ (faxNumber >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "HeadOffice{" +
                "faxNumber=" + faxNumber +
                '}';
    }
}
