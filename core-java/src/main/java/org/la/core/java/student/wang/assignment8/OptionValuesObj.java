package org.la.core.java.student.wang.assignment8;

public class OptionValuesObj {
    public static void main(String[] args) {
        OptionValues optionValues = new OptionValues();

        optionValues.setId(1);
        optionValues.setOptionId(2);
        optionValues.setValueName("IT");

        System.out.println("optionValues.getId() = " + optionValues.getId());
        System.out.println("optionValues.getOptionId() = " + optionValues.getOptionId());
        System.out.println("optionValues.getValueName() = " + optionValues.getValueName());
    }
}
