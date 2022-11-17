package companyInterviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Transaction{
    String friend1;
    String friend2;
    Double amount;
    Transaction(String friend1, String friend2, Double amount){
        this.friend1=friend1;
        this.friend2=friend2;
        this.amount=amount;
    }
}
public class DunzoSimplification {
    public static List<String> simplifyTransactions(List<Transaction> transactions){
        List<String> res=new ArrayList<>();
        Map<String, Double> takeMap=new HashMap<>();
        for(Transaction transaction:transactions){
            takeMap.putIfAbsent(transaction.friend2, 0.0);
            takeMap.put(transaction.friend2, takeMap.get(transaction.friend2)+ transaction.amount);
        }

        for(Transaction transaction:transactions){
            takeMap.putIfAbsent(transaction.friend1, 0.0);
            takeMap.put(transaction.friend1, takeMap.get(transaction.friend1)- transaction.amount);
        }
        System.out.println(takeMap);

        String bankCandidate=null;
        for(String person:takeMap.keySet()){
            if(takeMap.get(person)<0){
                bankCandidate=person;
                break;
            }
        }

        for(String person:takeMap.keySet()){
            if(!person.equals(bankCandidate) && takeMap.get(person)<0){
                res.add(person+" gives "+(takeMap.get(person)*-1)+" Rs to "+bankCandidate);
                takeMap.put(bankCandidate, takeMap.get(bankCandidate)+takeMap.get(person));
                takeMap.put(person,0.0);
            }
        }

        for(String person:takeMap.keySet()){
            if(!person.equals(bankCandidate) && takeMap.get(person)>0){
                res.add(bankCandidate+" gives "+(takeMap.get(person))+" Rs to "+person);
                takeMap.put(bankCandidate, takeMap.get(bankCandidate)+takeMap.get(person));
                takeMap.put(person,0.0);
            }
        }
//        System.out.println(takeMap.get(bankCandidate));
        return res;
    }

    public static void main(String[] args) {
        List<Transaction> input=new ArrayList<>();
        input.add(new Transaction("Sachin", "Aashish", 20.0));
        input.add(new Transaction("Sanjib", "Sachin", 70.0));
        input.add(new Transaction("Aashish", "Sanjib", 40.0));
        input.add(new Transaction("Aashish", "Manu", 100.0));

        System.out.println(simplifyTransactions(input));
    }
}
