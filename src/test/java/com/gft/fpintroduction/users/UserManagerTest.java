package com.gft.fpintroduction.users;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Some of this code was copied from https://jlordiales.me/2014/11/01/overview-java-8/
 */
public class UserManagerTest {

    List<User> allUsers = generateUsers();

    UserManager userManager = new UserManager();

    @Test
    public void testGroupUsers() {
        assertThat(UserManager.groupUsers(allUsers)).isEqualTo(groupUsers(allUsers));
    }

    private Map<Sex, List<User>> groupUsers(List<User> allUsers) {
        Map<Sex, List<User>> result = new HashMap<>();
        for (User user : allUsers) {
            if (user.getAge() >= 18) {
                List<User> currentUsers = result.get(user.getSex());
                if (currentUsers == null) {
                    currentUsers = new ArrayList<>();
                    result.put(user.getSex(), currentUsers);
                }
                currentUsers.add(user);
            }
        }
        return result;
    }

    List<User> generateUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User(2, "Jim", Sex.MALE));
        users.add(new User(7, "Abe", Sex.MALE));
        users.add(new User(9, "Paul", Sex.MALE));
        users.add(new User(5, "Simon", Sex.MALE));

        users.add(new User(3, "Jen", Sex.FEMALE));
        users.add(new User(5, "Anna", Sex.FEMALE));
        users.add(new User(9, "Pearl", Sex.FEMALE));
        users.add(new User(9, "Shanaz", Sex.FEMALE));

        return users;
    }
}
