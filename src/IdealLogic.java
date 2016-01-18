import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Dante on 16.01.2016.
 */
public class IdealLogic {

    private Vector answers;
    ManResult form;
    ResultTables rt;
    double[] divider = {0.3386, 0.3634, 0.3892, 0.4162, 0.4438, 0.4725, 0.5023, 0.5329,
            0.5697, 0.6025};
    int nearestIndex;
    Double[] toFields = new Double[10];
    //double primaryKey = 0.0;

    public IdealLogic(Vector answers, ManResult form) {
        this.form = form;
        this.answers = answers;
        rt = new ResultTables("ideal");
    }

    public double countMenIdeal() {
        String weightStr = answers.elementAt(1).toString();
        String heightStr = answers.elementAt(0).toString();
        double ratio = Double.parseDouble(weightStr)/Integer.parseInt(heightStr);
        //System.out.println("ratio " + ratio);
        //int nearestIndex;
        double multiplier = 1.0;


        for(int i = 0; i <divider.length-1; i++) {
            if(ratio < 0.3386) {
                //dopisz obsluge
            }
            if(ratio > 0.6025) {
                //tu tez dopisz
            }
            if(ratio == divider[i]) {
                nearestIndex = i;
                //primaryKey = divider[i];
            }
            if(ratio >= divider[i] && ratio <= divider[i+1]) {
                nearestIndex = i;
                //primaryKey = divider[i];
                multiplier = 1.0 + (divider[i+1] - divider[i])/divider[i];
            }
        }
        return multiplier;
    }

    public Double[] returnData() {
        double multiplier = countMenIdeal();
        //Double[] toFields = new Double[10];
        toFields = rt.getIdealMap(divider[nearestIndex]);
        for(int i = 0; i < toFields.length; i++) {
            toFields[i] = toFields[i] * multiplier;
        }

        return toFields;
    }
}
