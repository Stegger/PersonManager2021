package bll;

import be.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    private List<Person> persons;

    public PersonManager() {
        persons = new ArrayList<>();
    }

    public Person getPerson(int id) {
        for (Person person : persons) {
            if (person.getId() == id)
                return person;
        }
        return null;
    }

    public Person getBinaryPerson(int id) {
        persons.sort((o1, o2) -> o1.getId() - o2.getId());

        int first = 0;
        int last = persons.size() - 1;

        while (first <= last)
        {
            int middle = last + ((first - last) / 2);

            Person middlePerson = persons.get(middle);

            if (middlePerson.getId() == id) {
                return middlePerson;
            } else if (middlePerson.getId() < id) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return null;
    }


}
