package seedu.duke.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void getPersonName() {
        Person person = new Person("Duke", "2018");
        String name = "Duke";
        assertEquals(name, Person.getName());
    }

    @Test
    void getPersonYear() {
        Person person = new Person("Duke", "2018");
        String matricYear = "2018";
        assertEquals(matricYear, Person.getMatricYear());
    }

    @Test
    void createNewUser() {
        assertFalse(Person.isPersonExist());
        Person.createNewUser();
        assertEquals("User", Person.getName());
        assertEquals("2020", Person.getMatricYear());
        assertTrue(Person.isPersonExist());
    }

    @Test
    void getTotalCap() {
        Person.setTotalCap(5.0);
        assertEquals(5.0, Person.getTotalCap());
    }

    @Test
    void toStorageString() {
        Person person = new Person("Duke", "2018");
        assertEquals("Duke,2018",Person.toStorageString());
    }

    @Test
    void addTotalModuleCreditCompleted() {
        assertEquals(0, Person.getTotalModuleCreditCompleted());
        Person.addTotalModuleCreditCompleted(4);
        assertEquals(4, Person.getTotalModuleCreditCompleted());
    }

}
