package com.prst.file;

import com.prst.file.pojouser.User;

import java.io.IOException;

public class DriveClass {
    public static void main(String... args) throws IOException {
        Converter.toJSON(new User(1, "Alex", "+38000000001", "level"));
        User user = Converter.toJavaObject();
        System.out.println(user);
    }
}
