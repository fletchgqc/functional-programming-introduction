package com.gft.fpintroduction.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task: Replace the groupUsers implementation with one which uses functional elements of Java 8 (i.e. Streams). The
 * UserManagerTest must stay green.
 * <p>
 * Some of this code was copied from https://jlordiales.me/2014/11/01/overview-java-8/
 */
public class UserManager {

    public static Map<Sex, List<User>> groupUsers(List<User> allUsers) {
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
}
