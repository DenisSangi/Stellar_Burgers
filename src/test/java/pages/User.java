package pages;

import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

@Data
public class User {

    private final String name;
    private final String email;
    private final String password;


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static User getExistedUser() {
        return new User("den3", "ds3@gmail.com", "Qwer1234");
    }

    public static User getRandomUser() {
        return new User(RandomStringUtils.randomAlphanumeric(4), RandomStringUtils.randomAlphanumeric(4) + "@gmail.com", RandomStringUtils.randomAlphanumeric(8));
    }

    public static User geShortPasswordUser() {
        return new User(RandomStringUtils.randomAlphanumeric(4), RandomStringUtils.randomAlphanumeric(4) + "@gmail.com", RandomStringUtils.randomAlphanumeric(5));
    }

}
