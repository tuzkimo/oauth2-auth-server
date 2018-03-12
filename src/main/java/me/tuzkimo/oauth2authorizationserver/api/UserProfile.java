package me.tuzkimo.oauth2authorizationserver.api;

/**
 * Created by tuzkimo on 2018-03-07 16:28
 */
public class UserProfile {
  private String name;
  private String email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
