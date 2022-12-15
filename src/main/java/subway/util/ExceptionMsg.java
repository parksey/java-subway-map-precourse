package subway.util;

public enum ExceptionMsg {
    ERROR("[ERROR] "),
    NULL("아무 값도 입력하지 않았습니다."),
    NOT_MAIN_FUNCTION("메인 기능 값이 아닙니다."),
    NOT_DETAIL_FUNCTION("역이나 노션 관련 기능 선택이 아닙니다."),
    NOT_SECTION_FUNCTION("구간 관리 기능 선택이 아닙니다."),
    LIMIT_LENGTH("이름은 최소 2글자 이상입니다."),
    EXIST_STATION("이미 존재하는 역입니다."),
    EXIST_LINE("이미 존재하는 노선입니다."),
    CANNOT_DELETE("노선에 존재하여 삭제할 수 없습니다."),
    NOT_NUMBER("숫자가 아닙니다."),
    OUT_OF_RANGE("범위 밖의 구간에 넣으려 합니다.");

    private final String msg;

    ExceptionMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return ERROR.msg + msg;
    }
}
