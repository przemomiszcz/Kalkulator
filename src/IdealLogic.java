import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Dante on 16.01.2016.
 */
public class IdealLogic {

    private Vector answers;
    ManResult form;
    WomanResult wr;
    ResultTables rt;
    double[] divider = {0.3386, 0.3634, 0.3892, 0.4162, 0.4438, 0.4725, 0.5023, 0.5329,
            0.5697, 0.6025};
    int nearestIndex;
    Double[] toFields = new Double[10];

    public IdealLogic(Vector answers, ManResult form) {
        this.form = form;
        this.answers = answers;
        rt = new ResultTables("ideal");
    }

    public IdealLogic(Vector answers, WomanResult form) {
        this.wr = form;
        this.answers = answers;
        rt = new ResultTables("ideal");
    }

    public Double[] countWomenIdeal() {
        String heightStr = answers.elementAt(0).toString();
        String typeStr = answers.elementAt(2).toString();
        int height = Integer.parseInt(heightStr);
        int type = Integer.parseInt(typeStr);
        Double[] tab = new Double[10];
        Double[] adjustment = new Double[10];

        if(height%2 == 0 && height <= 178 && height >= 156) {
            HashMap<Integer, Double[]> hm = rt.getIdealWomenMap(height);
            tab = hm.get(type);
        }
        if(height%2 != 0 && height <= 178 && height >= 156) {
            HashMap<Integer, Double[]> high = rt.getIdealWomenMap(height+1);
            HashMap<Integer, Double[]> low = rt.getIdealWomenMap(height-1);
            tab = high.get(type);
            adjustment = low.get(type);
            for(int i = 0; i < tab.length; i++) {
                adjustment[i] = (tab[i] - adjustment[i])/2;
                tab[i] = tab[i] - adjustment[i];
            }
        }

        return tab;
    }

    public double countMenIdeal() {
        String weightStr = answers.elementAt(1).toString();
        String heightStr = answers.elementAt(0).toString();
        double ratio = Double.parseDouble(weightStr)/Integer.parseInt(heightStr);
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
            }
            if(ratio >= divider[i] && ratio <= divider[i+1]) {
                nearestIndex = i;
                multiplier = 1.0 + (divider[i+1] - divider[i])/divider[i];
            }
        }
        return multiplier;
    }

    public Double[] returnManData() {
        double multiplier = countMenIdeal();
        toFields = rt.getIdealMenMap(divider[nearestIndex]);
        for(int i = 0; i < toFields.length; i++) {
            toFields[i] = toFields[i] * multiplier;
        }

        return toFields;
    }
}
