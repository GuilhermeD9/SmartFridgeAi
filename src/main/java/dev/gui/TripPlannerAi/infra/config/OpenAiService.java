package dev.gui.TripPlannerAi.infra.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {

    private ChatClient chatClient;

    public OpenAiService(ChatClient.Builder builder) {
        chatClient = builder.build();
    }

}
