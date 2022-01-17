package edu.it.repository;

import com.google.gson.Gson;
import edu.it.model.ClimaVehiculo;
import edu.it.service.Evaluador;
import org.apache.activemq.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import javax.jms.JMSException;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Listener {
    
    @Autowired
    Evaluador evaluador;
    
    private void procesarItemTransito(String strJson) {
        System.out.println("Intentando deserializar ");
        System.out.println(strJson);
        try {
            ClimaVehiculo cv = new Gson().fromJson(strJson, ClimaVehiculo.class);
            evaluador.evaluar(cv.tipoClima, cv.datosVehiculo);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @JmsListener(destination = "tau")
    public void receiveMessage(final Message jsonMessage) throws JMSException {
        String messageData = null;
        //System.out.println("Received message " + jsonMessage);
        String response = null;
        if (jsonMessage instanceof TextMessage) {
                TextMessage textMessage = (TextMessage)jsonMessage;
                messageData = textMessage.getText();
                response  = "Recibido: " + messageData;
                System.out.println(response);
                // procesarItemTransito(messageData);
        }
    }
}
