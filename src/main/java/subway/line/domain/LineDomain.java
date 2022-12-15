package subway.line.domain;

import subway.domain.LineStations;
import subway.station.domain.Station;

import java.util.Arrays;
import java.util.List;

public class LineDomain {

    public String getStringName(String lineName) {
        Line.validateLine(lineName);
        return lineName;
    }
    public boolean regist(String lineName, Station upStation, Station downStation) {
        LineRepository.addLine(Line.of(lineName, LineStations.of(Arrays.asList(upStation, downStation))));
        return true;
    }

    public Station getStation(String stationName) {
        return Station.of(stationName);
    }

    public boolean delete(String lineName) {
        LineRepository.deleteLineByName(lineName);
        return true;
    }

    public List<Line> search() {
        return LineRepository.lines();
    }
}
