package subway.util;

public enum PrintMsg {
    INFO("[INFO] "),
    INPUT_MAIN("## 메인 화면"),
    INPUT_STATION("## 역 관리 화면"),
    INPUT_LINE("## 노선 관리 화면"),
    INPUT_SECTION("## 구간 관리 화면"),
    INPUT_SELECT("## 원하는 기능을 선택하세요."),
    LINE("## 노선을 입력하세요."),
    STATION("## 역이름을 입력하세요."),
    INPUT_NUMBER("## 순서를 입력하세요."),
    INPUT_LINE_SECTION("## 삭제할 구간의 노선을 입력하세요."),
    INPUT_STATION_SECTION("## 삭제할 구간의 역을 입력하세요."),
    INPUT_STATION_REGIST("## 등록할 역 이름을 입력하세요."),
    INPUT_STATION_DELETE("## 삭제할 역 이름을 입력하세요."),
    INPUT_LINE_NAME("## 등록할 노선 이름을 입력하세요."),
    INPUT_LINE_DELETE("## 삭제할 노선 이름을 입력하세요."),
    INPUT_UPSTATION("## 등록할 노선의 상행 종점역 이름을 입력하세요."),
    INPUT_DOWNSTATIOIN("## 등록할 노선의 하행 종점역 이름을 입력하세요."),
    SUCCESS_STATION_REGIST("[INFO] 지하철 역이 등록되었습니다."),
    SUCCESS_STATION_DELETE("[INFO] 지하철 역이 삭제되었습니다."),
    SUCCESS_LINE_REGIST("[INFO] 지하철 노선이 등록되었습니다."),
    SUCCESS_LINE_DELETE("[INFO] 지하철 노선이 삭제되었습니다."),
    SUCCESS_SECTION_REGIST("[INFO] 구간이 등록되었습니다."),
    SUCCESS_SECTION_DELETE("[INFO] 구간이 삭제되었습니다."),
    STATION_LIST("## 역 목록"),
    LINE_LIST("## 노선 목록");
    private final String msg;

    PrintMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
