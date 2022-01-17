package edu.it.repository;

import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
import javax.jms.TextMessage;
import javax.jms.JMSException;
import javax.jms.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

@Component
public class Producer {

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(final String queueName, final String message) {
        // Map map = new Gson().fromJson(message, Map.class);
        final String __textMessage = message;
        System.out.println("Enviando...  " + __textMessage + " cola - " + queueName);
        /*
        jmsTemplate.send(queueName, new MessageCreator() {
            public TextMessage createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage(__textMessage);
                return message;
            }
        });
        */
        
        jmsTemplate.send(queueName, (Session session) -> {
            TextMessage _message = session.createTextMessage(__textMessage);
            return _message;
        });
    }
}
