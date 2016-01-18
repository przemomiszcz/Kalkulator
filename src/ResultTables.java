import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dante on 07.01.2016.
 */
public class ResultTables {

    private HashMap[][] tables;
    private HashMap<Double, Double[]> table;
    private HashMap<Integer, HashMap<Integer, Double[]>> wTable;


    public ResultTables( String type) {
        if(type.equals("potency")) {
            tables = new HashMap[4][4];
            this.createPotencyMaps();
        } else if(type.equals("ideal")) {
            table = new HashMap<Double, Double[]>();
            this.createIdealManMaps();
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "jakis błąd!", "Błąd!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void createIdealWomanMaps() {
        HashMap<Integer, Double[]> hm = new HashMap<Integer, Double[]>();
        Double[] tab1 = {83.0, 85.0, 59.0, 93.0, 30.5, 46.0, 33.0, 31.0, 18.0, 78.0};
        Double[] tab2 = {85.5, 88.5, 61.0, 95.5, 31.5, 47.5, 34.0, 32.0, 18.5, 78.0};
        Double[] tab3 = {88.0, 92.5, 63.0, 98.5, 32.5, 49.0, 35.0, 33.0, 19.0, 78.0};
        hm.put(1, tab1);
        hm.put(2, tab2);
        hm.put(3, tab3);
        wTable.put(156, hm);


    }
    public void createIdealManMaps() {
        Double[] tmp = {33.5, 33.5, 27.5, 92.5, 69.5, 83.5, 50.5, 33.0};
        table.put(0.3386, tmp);

        Double[] duo = {37.0, 34.5, 28.5, 96.0, 72.0, 86.5, 52.0, 34.5};
        table.put(0.3634, duo);

        Double[] trio = {38.0,	36.0,	30.0,	100.0,	74.5,
                89.5,	54.0,	36.0};
        table.put(0.3892, trio);

        Double[] cietyre = {39.5,	37.0,	31.0,	103.5,	76.0,
                93.0,
                56.0,
                37.0 };
        table.put(0.4162, cietyre);

        Double[] piatc = {41.0,	38.5,	32.0,	107.0,	80.0,	96.0,
                57.5,	38.5};
        table.put(0.4438, piatc);

        Double[] szest = {42.5,	40.0,	33.0,	110.5,	83.0,	99.5,	59.5,	40.0};
        table.put(0.4725, szest);

        Double[] cos = {43.5,	41.0,	34.5,	114.5,	85.5,	103.0,	61.5,	41.0};
        table.put(0.5023, cos);

        Double[] sruo = {45.0,	42.5,	35.5,	118.0,	88.5,	106.0,	63.5,
                42.5};
        table.put(0.5329, sruo);

        Double[] muu = {46.5,	44.0,
                36.5,	122.0,	91.5,	109.5,	65.5,	44.0};
        table.put(0.5697, muu);

        Double[] cziz = {47.5,	45.0,
                37.5,	125.5,	94.0,	113.0,	68.0,
                45.0};
        table.put(0.6025, cziz);
    }

    public void createPotencyMaps() {
        HashMap zero18 = new HashMap();
        zero18 = this.createMap(zero18, 5.0, 5.9, 7.3);
        tables[0][0] = zero18;

        HashMap one18 = new HashMap();
        one18 = this.createMap(one18, 3.6, 4.5, 5.4);
        tables[1][0] = one18;

        HashMap three18 = new HashMap();
        three18 = this.createMap(three18, 2.3, 3.2, 3.6);
        tables[2][0] = three18;

        HashMap six18 = new HashMap();
        six18 = this.createMap(six18, 1.4, 2.3, 2.7);
        tables[3][0] = six18;

        HashMap zero26 = new HashMap();
        zero26 = this.createMap(zero26, 4.1, 5.4, 5.9);
        tables[0][1] = zero26;

        HashMap one26 = new HashMap();
        one26 = this.createMap(one26, 3.2, 3.6, 4.1);
        tables[1][1] = one26;

        HashMap three26 = new HashMap();
        three26 = this.createMap(three26, 2.3, 2.7, 3.2);
        tables[2][1] = three26;

        HashMap six26 = new HashMap();
        six26 = this.createMap(six26, 0.9, 1.8, 2.3);
        tables[3][1] = six26;

        HashMap zero36 = new HashMap();
        zero36 = this.createMap(zero36, 2.7, 3.2, 3.6);
        tables[0][2] = zero36;

        HashMap one36 = new HashMap();
        one36 = this.createMap(one36, 2.3, 2.7, 3.2);
        tables[1][2] = one36;

        HashMap three36 = new HashMap();
        three36 = this.createMap(three36, 1.4, 1.8, 2.3);
        tables[2][2] = three36;

        HashMap six36 = new HashMap();
        six36 = this.createMap(six36, 0.5, 0.9, 0.9);
        tables[3][2] = six36;

        HashMap zero46 = new HashMap();
        zero46 = this.createMap(zero46, 1.4, 1.8, 2.3);
        tables[0][3] = zero46;

        HashMap one46 = new HashMap();
        one46 = this.createMap(one46, 0.9, 1.4, 1.8);
        tables[1][3] = one46;

        HashMap three46 = new HashMap();
        three46 = this.createMap(three46, 0.5, 0.9, 0.9);
        tables[2][3] = three46;

        HashMap six46 = new HashMap();
        six46 = this.createMap(six46, 0.3, 0.7, 0.7);
        tables[3][3] = six46;
    }
    public HashMap createMap(HashMap map, double a1, double a2, double a3) {
        map.put("ekto", a1);
        map.put("mezo", a2);
        map.put("endo", a3);

        return map;
    }

    @Override
    public String toString() {

        String str = "";
        String s = "";
        for(int i = 0; i < tables.length; i++) {
            for(int j = 0; j < tables[0].length; j++) {
                str = str + tables[j][i];
            }
            str = str + '\n';
        }
        return str;
    }

    public HashMap getPotencyMap(int r, int c) {
        return tables[r][c];
    }

    public Double[] getIdealMap(double key) {
        return table.get(key);
    }
}
