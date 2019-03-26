package org.lvsazf.utils;

import org.lvsazf.interfaces.UserCase;

import java.util.List;

/**
 * @author 路智顺
 * @Description
 * @date 15:50 2019-01-15
 */
public final class PasswordUtils {
    @UserCase(id = 47, description = "Password must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UserCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UserCase(id = 49, description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
