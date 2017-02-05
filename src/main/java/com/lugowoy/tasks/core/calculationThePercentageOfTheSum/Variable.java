package com.lugowoy.tasks.core.calculationThePercentageOfTheSum;

import java.math.BigDecimal;

/**
 * Created by Konstantin Lugowoy on 30-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 30.01.2017
 * <p>
 * This class encapsulates the data necessary to calculate the percentage of the sum.
 */
public class Variable {
    /**
     * Field object storing the value of the sum.
     */
    private BigDecimal sum;
    /**
     * Field object storing the value of the percent.
     */
    private BigDecimal percent;
    /**
     * Field object storing the value of the part of sum.
     */
    private BigDecimal partOfSum;

    /**
     * The constructor to initialize the parameter of field {@link Variable#sum}.
     */
    public Variable(BigDecimal sum) {
        this.sum = sum;
    }

    /**
     * The constructor to initialize the parameters of fields {@link Variable#sum}, {@link Variable#percent}.
     */
    public Variable(BigDecimal sum, BigDecimal partOfSum) {
        this.sum = sum;
        this.partOfSum = partOfSum;
    }

    /**
     * Get value of the sum.
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Set value of the sum.
     */
    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    /**
     * Get value of the percent.
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Set value of the percent.
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /**
     * Get value of the part of sum.
     */
    public BigDecimal getPartOfSum() {
        return partOfSum;
    }

    /**
     * Set value of the part of sum.
     */
    public void setPartOfSum(BigDecimal partOfSum) {
        this.partOfSum = partOfSum;
    }
}
