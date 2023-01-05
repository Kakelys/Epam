package service;

import model.User;

public class UserCreator {

    public static final String TESTDATA_USER_EMAIL = "senotest";
    public static final String TESTDATA_USER_PASSWORD = "senotest";

    public static User withCredentialsFromProperty() {
        return new User(TESTDATA_USER_EMAIL, TESTDATA_USER_PASSWORD);
    }

    public static User withEmptyUsername() {
        return new User("", TestDataReader.getTestData(TESTDATA_USER_PASSWORD));
    }

    public static User withEmptyPassword() {
        return new User(TestDataReader.getTestData(TESTDATA_USER_EMAIL), "");
    }
}
