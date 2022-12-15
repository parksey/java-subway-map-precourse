package subway.station.domain;

import subway.line.domain.LineException;
import subway.line.domain.LineRepository;

import java.util.List;

public class StationDomain {
    public boolean regist(String stationName) {
        StationRepository.addStation(Station.of(stationName));
        return true;
    }

    public boolean delete(String stationName) {
        LineException.isStationInLineException(stationName);
        return true;
    }

    public List<Station> search() {
        return StationRepository.stations();
    }
}
