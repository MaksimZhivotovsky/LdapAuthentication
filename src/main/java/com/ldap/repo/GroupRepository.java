package com.ldap.repo;

import com.ldap.model.Group;
import com.ldap.model.GroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

@Service
public class GroupRepository {

    @Autowired
    private LdapTemplate ldapTemplate;

    public String create(GroupVO ldapUserVO) {
        Group ldapUser = new Group();
        ldapUser.setDn(LdapNameBuilder.newInstance(ldapUserVO.getDn()).build());
        ldapUser.setName(ldapUserVO.getName());

        ldapTemplate.create(ldapUser);

        return "success";
    }

    public Group findBy(String value) {
        return ldapTemplate.findOne(query().where("name").is(value), Group.class);
    }
//
//    public void update(Group group) {
//        ldapTemplate.update(group);
//    }
//
//    public void delete(Group group) {
//        ldapTemplate.delete(group);
//    }
//
    public List<Group> findAll() {
        return ldapTemplate.findAll(Group.class);
    }

}
