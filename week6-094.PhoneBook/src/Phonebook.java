import java.util.ArrayList;

/**
 * Created by James on 31/08/2017.
 */
public class Phonebook {
    private ArrayList<Person> personList = new ArrayList<>();

    public void add(String name, String number){
        Person person = new Person(name,number);
        this.personList.add(person);
    }
    public void printAll(){
        for (Person people:personList){
            System.out.println(people);
        }
    }
    public String searchNumber(String name){
        for (Person people:personList){
            if (people.getName().contains(name)){
                return people.getNumber();
            }
        }
        return "number not found";
    }
}
