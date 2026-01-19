package datastreams_knu.bigpicture.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import datastreams_knu.bigpicture.common.config.AiModelConfig;
import datastreams_knu.bigpicture.common.exception.ObjectMapperException;
import datastreams_knu.bigpicture.schedule.service.dto.RecommendedKeywordDto;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatLanguageModel;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static datastreams_knu.bigpicture.common.util.TickerParserPrompt.TICKER_PARSER_PROMPT;

//@RequiredArgsConstructor
@Component
@Slf4j
public class TickerParser {

//    private final AiModelConfig aiModelConfig;
//    private final ObjectMapper objectMapper;

//    private ChatLanguageModel model;

//    @PostConstruct
//    public void init() {
//        this.model = aiModelConfig.openAiChatModel();
//    }

    public String parseTicker(String keyword) {
        log.info("TickerParser: AI Bypass - Using raw keyword: {}", keyword);

        // OpenAI한테 물어보지 말고, 들어온 글자 그대로 대문자로 바꿔서 반환
        if (keyword == null) {
            return "";
        }
        return keyword.trim().toUpperCase();
    }


//    private UserMessage createPrompt(String ticker) {
//        String basePrompt = TICKER_PARSER_PROMPT;
//
//        String prompt = basePrompt.formatted(ticker);
//
//        UserMessage userMessage = new UserMessage(prompt);
//        return userMessage;
//    }
}