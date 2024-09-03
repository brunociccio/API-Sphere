<<<<<<< HEAD
package br.com.fiap.apisphere.user.dto;

import java.time.LocalDateTime;

import br.com.fiap.apisphere.user.User;

public record UserResponse (
    Long id,
    String name,
    String bio,
    String email,
    LocalDateTime createAt
) {

    public static UserResponse from(User user) {
        return new UserResponse(
            user.getId(),
            user.getName(),
            user.getBio(),
            user.getEmail(),
            user.getCreatedAt());
    }
    
}
=======
package br.com.fiap.apisphere.user.dto;

import java.time.LocalDateTime;

import br.com.fiap.apisphere.user.User;

public record UserResponse (
    Long id,
    String name,
    String bio,
    String email,
    LocalDateTime createAt
) {

    public static UserResponse from(User user) {
        return new UserResponse(
            user.getId(),
            user.getName(),
            user.getBio(),
            user.getEmail(),
            user.getCreatedAt());
    }
    
}
>>>>>>> 18444a73f89392adca82e39a950e49b14fbd5a4b
