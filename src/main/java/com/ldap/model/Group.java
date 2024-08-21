package com.ldap.model;

import lombok.Data;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

@Data
@Entry(objectClasses = {"top", "organizationalUnit"})
public final class Group {

    @Id
    private Name dn;
    @Attribute(name = "ou")
//    @DnAttribute(value = "ou")
    private String name;
//    @Attribute(name = "sn")
//    private String lastname;
//    @Attribute(name = "givenname")
//    private String givenname;
//    @Attribute(name = "mail")
//    private String mail;
//    @Attribute(name = "description")
//    private String description;
//    @Attribute(name = "uid")
//    private String uid;

//
//    private static final String BASE_DN = "dc=memorynotfound,dc=com";
//
//    @Id
//    private Name dn;
//
//    @Attribute(name="cn")
//    @DnAttribute("cn")
//    private String name;
//
//    @Attribute(name="uniqueMember")
//    private Set<Name> members;
//
//    public Group() {
//    }
//
//    public Group(String name, Set<Name> members) {
//        Name dn = LdapNameBuilder.newInstance(BASE_DN)
//                .add("ou", "groups")
//                .add("cn", name)
//                .build();
//        this.dn = dn;
//        this.name = name;
//        this.members = members;
//    }
//
//    public Group(Name dn, String name, Set<Name> members) {
//        this.dn = dn;
//        this.name = name;
//        this.members = members;
//    }

//    public Name getDn() {
//        return dn;
//    }
//
//    public void setDn(Name dn) {
//        this.dn = dn;
//    }
//
//    public Set<Name> getMembers() {
//        return members;
//    }
//
//    public void setMembers(Set<Name> members) {
//        this.members = members;
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
//    public void addMember(Name member) {
//        if (this.members == null){
//            this.members = new HashSet<>();
//        }
//        members.add(member);
//    }
//
//    public void removeMember(Name member) {
//        members.remove(member);
//    }
//
//    @Override
//    public String toString() {
//        return "Group{" +
//                "dn=" + dn +
//                ", name='" + name + '\'' +
//                ", members=" + members +
//                '}';
//    }
}