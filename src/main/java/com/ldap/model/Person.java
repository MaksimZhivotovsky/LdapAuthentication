package com.ldap.model;

import lombok.Data;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;


@Data
@Entry(objectClasses = {"inetOrgPerson", "organizationalPerson", "person", "top"})
public final class Person {

//    private static final String BASE_DN = "dc=nishant,dc=com";

    @Id
    private Name dn;
    @Attribute(name = "cn")
    @DnAttribute(value = "cn")
    private String fullname;
    @Attribute(name = "sn")
    private String lastname;
    @Attribute(name = "givenname")
    private String givenname;
    @Attribute(name = "mail")
    private String mail;
    @Attribute(name = "description")
    private String description;
    @Attribute(name = "uid")
    private String uid;

//    @Id
//    private Name dn;
//
//    @DnAttribute(value="uid")
//    private String uid;
//
//    @Attribute(name="cn")
//    private String fullName;
//
//    @Attribute(name="sn")
//    private String lastName;
//
//    @DnAttribute(value="ou")
//    @Transient
//    private String group;

//    public Person() {
//    }
//
//    public Person(String fullName, String lastName) {
//        Name dn = LdapNameBuilder.newInstance(BASE_DN)
//                .add("ou", "people")
//                .add("uid", fullName)
//                .build();
//        this.dn = dn;
//        this.fullName = fullName;
//        this.lastName = lastName;
//    }

//    public String getUid() {
//        return uid;
//    }
//
//    public Name getDn() {
//        return dn;
//    }
//
//    public void setDn(Name dn) {
//        this.dn = dn;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "dn=" + dn +
//                ", uid='" + uid + '\'' +
//                ", fullName='" + fullName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", group='" + group + '\'' +
//                '}';
//    }
}
