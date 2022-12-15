package subway.controller;

import subway.domain.SectionDomain;
import subway.station.domain.Station;
import subway.util.MainFunction;
import subway.util.PrintMsg;
import subway.util.SectionFunction;
import subway.view.InputView;
import subway.view.OutputView;

public class SectionController implements Controllerable{
    private final InputView inputView;
    private final OutputView outputView;
    private final SectionDomain sectionDomain;

    public SectionController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.sectionDomain = new SectionDomain();
    }

    @Override
    public void start() {
        String select = readSectionInput();
        selectFunction(select);
    }

    public String readSectionInput() {
        outputView.printSection();
        return getLineInput();
    }

    public String getLineInput() {
        while (true) {
            try {
                outputView.printEmptyMsg();
                outputView.printMsg(PrintMsg.INPUT_SELECT.getMsg());
                return inputView.getSectionInput();
            } catch (IllegalArgumentException exception) {
                outputView.printEmptyMsg();
                outputView.printMsg(exception.getMessage());
            }
        }
    }

    public void selectFunction(String select) {
        if (select.equals(SectionFunction.REGIST.getSelect())) {
            registSection();
        }
        if (select.equals(SectionFunction.DELETE.getSelect())) {
            deleteSection();
        }
    }

    public void registSection() {
        if (isRegistSection()) {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.SUCCESS_SECTION_REGIST.getMsg());
        }
    }
    public boolean isRegistSection() {
        try {
            String lineName = getLineName(PrintMsg.LINE.getMsg());
            String stationName = getStationName(PrintMsg.STATION.getMsg());
            int order = getOrder(lineName, PrintMsg.INPUT_NUMBER.getMsg());
            return sectionDomain.regist(lineName, stationName, order);
        } catch (IllegalArgumentException exception) {
            outputView.printEmptyMsg();
            outputView.printMsg(exception.getMessage());
        }
        return false;
    }
    public String getLineName(String msg) {
        outputView.printEmptyMsg();
        outputView.printMsg(msg);
        return sectionDomain.getStringName(inputView.getStationName());
    }

    public String getStationName(String msg) {
        outputView.printEmptyMsg();
        outputView.printMsg(msg);
        return sectionDomain.getStationName(inputView.getStationName());
    }

    public int getOrder(String lineName, String msg) {
        outputView.printEmptyMsg();
        outputView.printMsg(msg);
        return sectionDomain.getOrder(lineName, inputView.getOrder());
    }

    public void deleteSection() {
        if (isDeleteSection()) {
            outputView.printEmptyMsg();
            outputView.printMsg(PrintMsg.SUCCESS_SECTION_REGIST.getMsg());
        }
    }
    public boolean isDeleteSection() {
        try {
            String lineName = getLineName(PrintMsg.INPUT_LINE_SECTION.getMsg());
            String stationName = getStationName(PrintMsg.INPUT_STATION_SECTION.getMsg());
            return sectionDomain.delete(lineName, stationName);
        } catch (IllegalArgumentException exception) {
            outputView.printEmptyMsg();
            outputView.printMsg(exception.getMessage());
        }
        return false;
    }
}
