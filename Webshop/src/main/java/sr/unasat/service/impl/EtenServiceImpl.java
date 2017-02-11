package sr.unasat.service.impl;

import sr.unasat.service.EtenService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rpique on 1/25/2017.
 */
public class EtenServiceImpl implements EtenService {
    @Override
    public List<String> getFood() {
        return Arrays.asList("Teloh", "Gritbana", "Bakabana", "Saouto", "Roti");
    }
}
