package me.tuzkimo.oauth2authorizationserver.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tuzkimo on 2018-03-07 16:27
 */
@RestController
@RequestMapping("/api")
public class UserController {

  @GetMapping("/profile")
  private ResponseEntity<UserProfile> profile() {
    User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    UserProfile profile = new UserProfile();
    profile.setName(user.getUsername());
    profile.setEmail(user.getUsername() + "@domain.local");

    return ResponseEntity.ok(profile);
  }
}
