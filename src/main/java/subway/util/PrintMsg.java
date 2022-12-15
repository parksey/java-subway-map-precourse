package subway.util;

public enum PrintMsg {
    INPUT_MAIN("## 메인 화면"),
    INPUT_STATION("## 역 관리 화면"),
    INPUT_SELECT("## 원하는 기능을 선택하세요."),
    INPUT_STATION_REGIST("## 등록할 역 이름을 입력하세요."),
    INPUT_STATION_DELETE("## 삭제할 역 이름을 입력하세요."),
    SUCCESS_STATION_REGIST("[INFO] 지하철 역이 등록되었습니다."),
    SUCCESS_STATION_DELETE("[INFO] 지하철 역이 삭제되었습니다.");
    private final String msg;

    PrintMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
