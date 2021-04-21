package se.lexicon.ola.registration.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import se.lexicon.ola.registration.entity.Student;

import java.time.LocalDateTime;

@SpringBootTest
public class StudentTest {


    Student testStudent;

    @BeforeEach
    public void setUp(){
        testStudent = new Student();
        testStudent.setFirstName("Ola");
        testStudent.setLastName("Ulvås");
        testStudent.setAge(50);
        testStudent.setGender("Male");
        testStudent.setEmail("olaulvas@hotmail.com");
        testStudent.setPhoneNumber("073-3500381");
        testStudent.setRegisterDate(LocalDateTime.of(1970,6,4,9,50));
        testStudent.setStatus(true);
    }

    @Test
    @DisplayName("Test 1  - Created Student")
    public void create_student(){

        String expectedFirstName = "Ola";
        String actualFirstName = testStudent.getFirstName();
        Assertions.assertEquals(expectedFirstName, actualFirstName);

        String expectedLastName = "Ulvås";
        String actualLastName = testStudent.getLastName();
        Assertions.assertEquals(expectedLastName, actualLastName);

        int expectedAge = 50;
        int actualAge = testStudent.getAge();
        Assertions.assertEquals(expectedAge, actualAge);

        String expectedGender = "Male";
        String actualGender = testStudent.getGender();
        Assertions.assertEquals(expectedGender, actualGender);

        String expectedEmail = "olaulvas@hotmail.com";
        String actualEmail = testStudent.getEmail();
        Assertions.assertEquals(expectedEmail, actualEmail);

        String expectedPhoneNumber = "073-3500381";
        String actualPhoneNumber = testStudent.getPhoneNumber();
        Assertions.assertEquals(expectedPhoneNumber, actualPhoneNumber);

        LocalDateTime expectedRegisterDate = LocalDateTime.of(1970,06,04,9,50);
        LocalDateTime actualRegisterDate = testStudent.getRegisterDate();
        Assertions.assertEquals(expectedRegisterDate, actualRegisterDate);

        boolean expectedStatus = true;
        boolean actualStatus = testStudent.isStatus();
        Assertions.assertEquals(expectedStatus, actualStatus);

    }

}
