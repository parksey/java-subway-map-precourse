package subway.util;

public enum PrintMsg {
    INPUT_MAIN("## 메인 화면"),
    INPUT_STATION("## 역 관리 화면"),
    INPUT_SELECT("## 원하는 기능을 선택하세요.");
    private final String msg;

    PrintMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
