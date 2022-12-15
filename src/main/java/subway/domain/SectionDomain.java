package subway.domain;

import subway.line.domain.Line;
import subway.line.domain.LineException;
import subway.line.domain.LineRepository;
import subway.station.domain.Station;
import subway.station.domain.StationRepository;

public class SectionDomain {
    public String getStringName(String name) {
        Line.validateLine(name);
        return name;
    }

    public String getStationName(String name) {
        LineException.isStationInLineException(name);
        return name;
    }

    public int getOrder(String lineName, int order) {
        LineException.outOfRangeException(lineName, order);
        return order;
    }

    public boolean regist(String lineName, String stationName, int order) {
        LineRepository.sectionRegist(lineName, stationName, order);
        return true;
    }

    public boolean delete(String lineName, String stationName) {
        LineRepository.sectionDelete(lineName, stationName);
        return true;
    }
}
