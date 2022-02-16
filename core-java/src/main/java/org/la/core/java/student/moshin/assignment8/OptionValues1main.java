package org.la.core.java.student.moshin.assignment8;

public class OptionValues1main {
	public static void main(String[] args) {
        OptionValues1 optionValues = new OptionValues1();

        optionValues.setId(1);
        optionValues.setOptionId(2);
        optionValues.setValueName("IT");

        System.out.println("optionValues.getId() = " + optionValues.getId());
        System.out.println("optionValues.getOptionId() = " + optionValues.getOptionId());
        System.out.println("optionValues.getValueName() = " + optionValues.getValueName());
    }
}
