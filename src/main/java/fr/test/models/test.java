package fr.test.models;

import org.springframework.stereotype.Component;

/**
 * Created by lionel on 23/07/2014.
 */

@Component
public class test {
    private String name = "super";
    private String surname= "yoyo";

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
