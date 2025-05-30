package datastreams_knu.bigpicture.alert.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CrawledNewsDto {
    public YibKrA YIB_KR_A;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class YibKrA {
        public List<Result> result;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Result {
        public String DATETIME;
        public String CID;
        public String KEYWORD;
        public String EDIT_TITLE;
    }
}