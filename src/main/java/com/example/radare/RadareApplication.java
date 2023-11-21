package com.example.radare;

import com.example.radare.models.Message;
import com.example.radare.models.Render;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RadareApplication {

    public static void main(String[] args) {
        Render render = new Render();
        Message message1 = new Message("2023-11-21T08:25:43.511Z", "A^`^\u001Dmrqbqf\u001D`fqf\u001D^`bpq\u001Djbp^g)\u001Dfkpb^jk^\u001D`^\u001D^qf\u001Dmoljls^q", "atreides");
        Message message2 = new Message("2023-11-21T08:26:43.511Z", "P^irq^of\u001Dab\u001Di^\u001DM^ri", "atreides");
        Message message3 = new Message("2023-11-21T08:27:43.511Z", "Ucnwvctk\"fg\"nc\"dctqpwn\"Jctmqppgp", "harkonnen");
        render.visitMessage(message1);
        render.visitMessage(message2);
        render.visitMessage(message3);
        render.decodeMessage(message1);
        render.decodeMessage(message2);
        render.decodeMessage(message3);
      //  SpringApplication.run(RadareApplication.class, args);
    }
}
