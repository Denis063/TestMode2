package ru.netology.web;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;
import ru.netology.web.UserInfo;

@UtilityClass
public class DataGenerator {

    @UtilityClass
    public static class RegistrationDataGenerator {

        public static UserInfo generateData(String status) {
            Faker faker = new Faker();
            return new UserInfo(faker.name().firstName(), faker.internet().password(), status);
        }

        public static String generateLogin() {
            Faker faker = new Faker();
            return faker.name().firstName();
        }

        public static String generatePassword() {
            Faker faker = new Faker();
            return faker.internet().password();
        }
    }
}