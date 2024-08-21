package com.ldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

//    @PostConstruct
//    public void init() {
//        log.info("Spring LDAP Object Directory Mapping (ODM) Configuration Example");
//
//        log.info("- - - - - Managing LDAP persons using Spring LDAP ODM");
//
//        List<Person> persons = personRepository.findAll();
//        log.info("persons: " + persons);
//
//        Person olivier = new Person("Olivier Sips", "Sips");
//        personRepository.create(olivier);
//
//        Person john = personRepository.findByUid("john");
//        personRepository.delete(john);
//
//        Person jahn = personRepository.findByUid("jahn");
//        jahn.setLastName("custom last name");
//        personRepository.update(jahn);
//
//        List<Person> result = personRepository.findByLastName("custom last name");
//        log.info("result: " + result);
//
//        persons = personRepository.findAll();
//        log.info("persons: " + persons);
//
//        log.info("- - - - - Managing LDAP groups using Spring LDAP ODM");
//
//        List<Group> groups = groupRepository.findAll();
//        log.info("groups: " + groups);
//
//        Group otherEmployees = new Group("other employees", null);
//        otherEmployees.addMember(jahn.getDn());
//        groupRepository.create(otherEmployees);
//
//        Group developers = groupRepository.findBy("cn", "developers");
//        developers.removeMember(john.getDn());
//        groupRepository.update(developers);
//
//        Group managers = groupRepository.findBy("cn", "managers");
//        groupRepository.delete(managers);
//
//        groups = groupRepository.findAll();
//        log.info("groups: " + groups);
//
//        System.exit(-1);
//    }


}
