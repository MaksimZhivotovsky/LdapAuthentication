package com.ldap.controller;

import com.ldap.model.Person;
import com.ldap.model.Group;
import com.ldap.model.GroupVO;
import com.ldap.model.LdapUserVO;
import com.ldap.repo.GroupRepository;
import com.ldap.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ldap")
@RequiredArgsConstructor
public class LdapUserController {

    private final PersonRepository ldapUserRepository;
    private final GroupRepository groupRepository;

    @PostMapping(value = "/add")
    public String create(@RequestBody LdapUserVO personVO) {
        return ldapUserRepository.create(personVO);
    }

    @PostMapping(value = "/addG")
    public String create1(@RequestBody GroupVO personVO) {
        return groupRepository.create(personVO);
    }

//    @PutMapping(value = "/update")
//    public Person update(@RequestBody Person personVO) {
//        return ldapUserRepository.update(personVO);
//    }
//
//    @DeleteMapping(value = "/delete/{uid}")
//    public String delete(@PathVariable("uid") String uid) {
//        return ldapUserRepository.delete(uid);
//    }
//
    @GetMapping(value = "/findAll")
    public List<Person> findAll() {
        return ldapUserRepository.findAll();
    }

    @GetMapping(value = "/findAllGroup")
    public List<Group> findAllGroup() {
        return groupRepository.findAll();
    }

    @GetMapping(value = "/findByUid/{name}")
    public Group findByUid(@PathVariable("name") String name) {
        return groupRepository.findBy(name);
    }
//
//    @GetMapping(value = "/findByLastName/{lastName}")
//    public LdapUser findByLastName(@PathVariable("lastName") String lastName) {
//        return ldapUserRepository.findByLastName(lastName);
//    }

//    @GetMapping(value = "/findAll-group")
//    public List<Group> findAllGroup() {
//        return groupRepository.findAll();
//    }
}

