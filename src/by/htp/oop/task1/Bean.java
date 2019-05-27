package by.htp.oop.task1;

import java.util.Objects;

public class Bean {

    private int firstParam;
    private int secondParam;

    public void setFirstParam(int firstParam) {
        this.firstParam = firstParam;
    }

    public int getFirstParam() {
        return firstParam;
    }

    public void setSecondParam(int secondParam) {
        this.secondParam = secondParam;
    }

    public int getSecondParam() {
        return secondParam;
    }

    @Override
    public String toString() {
        return "First value is: " + getFirstParam() + " Second value is: " + getSecondParam();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bean bean = (Bean) o;
        return firstParam == bean.firstParam &&
                secondParam == bean.secondParam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstParam, secondParam);
    }
}

