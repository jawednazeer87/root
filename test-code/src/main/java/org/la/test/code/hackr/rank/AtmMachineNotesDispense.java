package org.la.test.code.hackr.rank;
import java.util.*;
import static java.util.Map.Entry.*;
import static java.util.stream.Collectors.*;
import java.util.Map;

/*
    Withdraw money from ATM
    conditions
        Note denomination with number are provided in map
        key: notes denomination
        value: number of notes
        number of notes dispense should be less
        means try to dsipatch higher denomination as compare to lower
        for example to dispense 100 sgd
        either we can give 2*50 or 10*10 etc
        but can give 1 * 100
        so 1*100, number of notes are less
        then this is right answer
 */
public class AtmMachineNotesDispense {

    public static void main(String[] args) {

        Map<Integer, Integer> notes = new LinkedHashMap<>();
        //notes.put(100, 90);
        notes.put(50, 0);
        notes.put(10, 300);
        notes.put(5, 100);
        notes.put(2, 1950);
        notes.put(100, 90);

        boolean result = moneyDispense(notes, 1500);
    }

    static boolean moneyDispense(Map<Integer, Integer> notes, int amount) {

        Map<Integer, Integer> notesTM = new LinkedHashMap<>();

        //have to sort in descending order so first high denomination notes would be used in withdrawal of money
        //so number of notes would be less
        notesTM = notes.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e2, LinkedHashMap::new));
        int remainingAmount = amount;
        Map<Integer, Integer> denominationNumDispense = new LinkedHashMap<>();

        Iterator<Map.Entry<Integer, Integer>> notesNext = notesTM.entrySet().iterator();

        //always checking number of notes map having value or amount value greater than zero
        while (remainingAmount>0 && notesNext.hasNext()) {
            Map.Entry<Integer, Integer> denominationEntry = notesNext.next();
            Integer denomination = denominationEntry.getKey();
            Integer denominationCount = denominationEntry.getValue();
            //number of notes should be greater than zero
            if(denominationCount>0) {
                //amount of money should be lesser than total amount of money calculated by that specific
                //number of available denomination n also amount should be greater than denomination
                if (remainingAmount <= denomination * denominationCount && remainingAmount >= denomination) {
                    denominationNumDispense.put(denomination, remainingAmount / denomination);
                    remainingAmount = remainingAmount % denomination;
                }
                //if number of notes are less
                //but denomination is high then we will dispense all available notes
                //in previous if case we already checked that product of denomination of note and number of note
                //higher than amount required so we can dispense maximum value by product of denomination and number
                else if (remainingAmount >= denomination) {
                    remainingAmount = remainingAmount - denomination * denominationCount;
                    denominationNumDispense.put(denomination, denominationCount);
                }
            }
        }
        System.out.println("denominationNumDispense: "+denominationNumDispense);
        System.out.println("remaining: "+remainingAmount);
        System.out.println("deduct: "+(amount-remainingAmount));
        System.out.println("amount: "+amount);
        if(remainingAmount==0){
            System.out.println("denominationNum: "+denominationNumDispense);
            System.out.println("Customer able to withdraw money");
            return true;
        }
        System.out.println("Customer unable to withdraw money");
        return false;

    }

}