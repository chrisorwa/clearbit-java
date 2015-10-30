package com.clearbit.client.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Person {

  @JsonProperty String id;
  @JsonProperty Name name;
  @JsonProperty String email;
  @JsonProperty String gender;
  @JsonProperty String location;
  @JsonProperty Geo geo;
  @JsonProperty String bio;
  @JsonProperty String site;
  @JsonProperty String avatar;
  @JsonProperty Employment employment;
  @JsonProperty Facebook facebook;
  @JsonProperty Github github;
  @JsonProperty Twitter twitter;
  @JsonProperty LinkedIn linkedin;
  @JsonProperty GooglePlus googleplus;
  @JsonProperty AngelList angellist;
  @JsonProperty Klout klout;
  @JsonProperty Foursquare foursquare;
  @JsonProperty AboutMe aboutme;
  @JsonProperty Gravatar gravatar;
  @JsonProperty boolean fuzzy;

  @Data
  private static class Name {
    @JsonProperty String fullName;
    @JsonProperty String givenName;
    @JsonProperty String familyName;
  }

  @Data
  private static class Geo {
    @JsonProperty String city;
    @JsonProperty String state;
    @JsonProperty String stateCode;
    @JsonProperty String country;
    @JsonProperty String countryCode;
    @JsonProperty String lat;
    @JsonProperty String lng;
  }

  @Data
  private static class Employment {
    @JsonProperty String name;
    @JsonProperty String title;
    @JsonProperty String domain;
  }

  @Data
  private static class Facebook {
    @JsonProperty String handle;
  }

  @Data
  private static class Github {
    @JsonProperty String handle;
    @JsonProperty Long id;
    @JsonProperty String avatar;
    @JsonProperty String company;
    @JsonProperty String blog;
    @JsonProperty Long followers;
    @JsonProperty Long following;
  }

  @Data
  private static class Twitter {
    @JsonProperty String handle;
    @JsonProperty String id;
    @JsonProperty String bio;
    @JsonProperty Long followers;
    @JsonProperty Long following;
    @JsonProperty Long statuses;
    @JsonProperty Long favorites;
    @JsonProperty String location;
    @JsonProperty String site;
    @JsonProperty String avatar;
  }

  @Data
  private static class LinkedIn {
    @JsonProperty String handle;
  }

  @Data
  private static class GooglePlus {
    @JsonProperty String handle;
  }

  @Data
  private static class AngelList {
    @JsonProperty String handle;
    @JsonProperty Long id;
    @JsonProperty String bio;
    @JsonProperty String blog;
    @JsonProperty String site;
    @JsonProperty Long followers;
    @JsonProperty String avatar;
  }

  @Data
  private static class Klout {
    @JsonProperty String handle;
    @JsonProperty String score;
  }

  @Data
  private static class Foursquare {
    @JsonProperty String handle;
  }

  @Data
  private static class AboutMe {
    @JsonProperty String handle;
    @JsonProperty String bio;
    @JsonProperty String avatar;
  }

  @Data
  private static class Gravatar {
    @JsonProperty String handle;
    @JsonProperty List<Url> urls;
    @JsonProperty String avatar;
    @JsonProperty List<Avatar> avatars;

    @Data
    private static class Url {
      @JsonProperty String value;
      @JsonProperty String title;
    }

    @Data
    private static class Avatar {
      @JsonProperty String url;
      @JsonProperty String type;
    }
  }
}