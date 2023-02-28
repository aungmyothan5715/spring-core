package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("knight")   // type
public class Knight {



 //   @Autowired
    //@QuestType(type = QuestType.Type.Dimsel)
   // @Qualifier("dragon")  //@Qualifier("matrimony or dragon") , @Component("dragon") 's name.
    private Quest quest; // filed

    //@Autowired    //@Autowired is a BeanPostProcessor
    private MyClass myClass;

    public Knight(@Autowired(required = false) MyClass myClass, Quest quest) {
        //public Knight(@Autowired(required = false) MyClass myClass, Quest quest) {
        //public Knight(@Nullable MyClass myClass, Quest quest) {
        //public Knight(Optional<MyClass> MyClass myClass, Quest quest) {
        this.quest = quest;
        this.myClass = myClass;
    }

    public void setQuest(Quest quest) { //parameter
        this.quest = quest;
    }

    public String goQuest() {
        return quest.goQuest();

    }

    @Autowired
    public void setSpringBean(List<MyInterface> list) {
        System.out.println(list);
    }



}
