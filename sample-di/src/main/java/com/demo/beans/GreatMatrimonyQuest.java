package com.demo.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("matrimony")
//@QuestType(type = QuestType.Type.Matrimony)
@Primary
public class GreatMatrimonyQuest implements Quest{
    @Override
    public String goQuest() {
        return "Knight and princes perform the great matrimony.";
    }
}
