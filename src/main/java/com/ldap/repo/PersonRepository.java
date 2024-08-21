package com.ldap.repo;

import com.ldap.model.Person;
import com.ldap.model.LdapUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.stereotype.Service;
import java.util.List;
import static org.springframework.ldap.query.LdapQueryBuilder.query;

@Service
public class PersonRepository {

    @Autowired
    private LdapTemplate ldapTemplate;

    public String create(LdapUserVO ldapUserVO) {
        Person ldapUser = new Person();
        ldapUser.setDn(LdapNameBuilder.newInstance(ldapUserVO.getDn()).build());
        ldapUser.setDescription(ldapUserVO.getDescription());
        ldapUser.setFullname(ldapUserVO.getFullName());
        ldapUser.setLastname(ldapUserVO.getLastName());
        ldapUser.setGivenname(ldapUserVO.getGiveName());
        ldapUser.setMail(ldapUserVO.getMail());
        ldapUser.setUid(ldapUserVO.getUid());

        ldapTemplate.create(ldapUser);

        return "success";
    }

    public Person findByUid(String uid) {
        return ldapTemplate.findOne(query().where("uid").is(uid), Person.class);
    }

    public void update(Person person) {
        ldapTemplate.update(person);
    }

    public void delete(Person person) {
        ldapTemplate.delete(person);
    }

    public List<Person> findAll() {
        return ldapTemplate.findAll(Person.class);
    }

    public List<Person> findByLastName(String lastName) {
        return ldapTemplate.find(query().where("sn").is(lastName), Person.class);
    }
}
