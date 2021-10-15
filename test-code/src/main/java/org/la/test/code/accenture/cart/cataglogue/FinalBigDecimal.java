package org.la.test.code.accenture.cart.cataglogue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class FinalBigDecimal extends BigDecimal {
    public FinalBigDecimal(char[] in, int offset, int len) {
        super(in, offset, len);
    }

    public FinalBigDecimal(char[] in, int offset, int len, MathContext mc) {
        super(in, offset, len, mc);
    }

    public FinalBigDecimal(char[] in) {
        super(in);
    }

    public FinalBigDecimal(char[] in, MathContext mc) {
        super(in, mc);
    }

    public FinalBigDecimal(String val) {
        super(val);
    }

    public FinalBigDecimal(String val, MathContext mc) {
        super(val, mc);
    }

    public FinalBigDecimal(double val) {
        super(val);
    }

    public FinalBigDecimal(double val, MathContext mc) {
        super(val, mc);
    }

    public FinalBigDecimal(BigInteger val) {
        super(val);
    }

    public FinalBigDecimal(BigInteger val, MathContext mc) {
        super(val, mc);
    }

    public FinalBigDecimal(BigInteger unscaledVal, int scale) {
        super(unscaledVal, scale);
    }

    public FinalBigDecimal(BigInteger unscaledVal, int scale, MathContext mc) {
        super(unscaledVal, scale, mc);
    }

    public FinalBigDecimal(int val) {
        super(val);
    }

    public FinalBigDecimal(int val, MathContext mc) {
        super(val, mc);
    }

    public FinalBigDecimal(long val) {
        super(val);
    }

    public FinalBigDecimal(long val, MathContext mc) {
        super(val, mc);
    }


}
