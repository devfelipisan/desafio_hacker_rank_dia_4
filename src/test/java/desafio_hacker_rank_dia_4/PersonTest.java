package desafio_hacker_rank_dia_4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * 
 * Unit Test Person
 * @author Felipi Santana
 * @since 08/05/2021
 * 
 */

class PersonTest {
    final private Person person = new Person(-2);
    Random ageRandom = new Random();

    @Test
    @DisplayName("Create Object")
    void test_Create_Object(){
        assertTrue(person instanceof Person);
        assertEquals(0, person.getAge());
    }

    @Test
    @DisplayName("Method Setter Getter")
    void test_method_getter_setter() {
        
        for (int i=0; i<50 ; i++){
            int age = ageRandom.nextInt(100);
            person.setAge(age);
            assertEquals(age, person.getAge());
        }
    }

    @Test
    @DisplayName("Encapsulation")
    void test_Encapsulation() throws Exception{
        Field ageField = person.getClass().getDeclaredField("age");
        ageField.setAccessible(true);
    }

    @Test
    @DisplayName("Method amIOld")
    void test_Method_amIOld(){
        assertAll("condicional_amIOld",
            () -> person.setAge(12),
            () -> assertEquals("You are young.", person.amIOld()),
            () -> person.setAge(6),
            () -> assertEquals("You are young.", person.amIOld()),
            () -> person.setAge(0),
            () -> assertEquals("You are young.", person.amIOld()),
            () -> person.setAge(13),
            () -> assertEquals("You are a teenager.", person.amIOld()),
            () -> person.setAge(15),
            () -> assertEquals("You are a teenager.", person.amIOld()),
            () -> person.setAge(17),
            () -> assertEquals("You are a teenager.", person.amIOld()),
            () -> person.setAge(18),
            () -> assertEquals("You are old.", person.amIOld()),
            () -> person.setAge(21),
            () -> assertEquals("You are old.", person.amIOld())
        );
    }

    @Test
    @DisplayName("Method yearPasses")
    void test_method_yearPasses(){
        for (int i=0; i<50; i++){
            int age = ageRandom.nextInt(100);
            int result = age + 1;
            person.setAge(age);
            person.yearPasses();
            assertEquals(result, person.getAge());
        }
    }
}