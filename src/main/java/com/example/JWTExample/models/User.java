//package com.example.JWTExample.models;
//
//public class User {
//    private String userId;
//    private String name;
//    private String email;
//
//    // No-argument constructor
//    public User() {}
//
//    // All-argument constructor
//    public User(String userId, String name, String email) {
//        this.userId = userId;
//        this.name = name;
//        this.email = email;
//    }
//
//    // Getters and Setters (or use Lombok if working)
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}


package com.example.JWTExample.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String userId;
    private String name;
    private String email;
}
