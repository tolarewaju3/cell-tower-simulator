package org.codelikethewind;

import java.util.Random;

public class CallRecordGenerator {
    public static String getCallRecord(Boolean isDropped) {
        String cellId = "ATX";

        String latitude = "30.2672";
        String longitude = "-97.7431";

        Random rand = new Random();

        int signalStrengthInt = -110 + rand.nextInt(46); // -110 to -65
        String signalStrength = String.valueOf(signalStrengthInt);

        String callRecordJson = String.format(
                "{\"cell_id\": \"%s\", \"lat\": %s, \"lng\": %s, \"signal_strength\": %s, \"is_dropped\": %s}",
                cellId, latitude, longitude, signalStrength, isDropped.toString()
        );

        return callRecordJson;
    }


}
