package com.ldap.model;

import lombok.Data;

@Data
public class LdapUserVO {

    private String dn;
    private String fullName;
    private String lastName;
    private String giveName;
    private String mail;
    private String description;
    private String uid;
}
