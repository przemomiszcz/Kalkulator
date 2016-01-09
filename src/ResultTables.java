import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dante on 07.01.2016.
 */
public class ResultTables {



    private HashMap[][] tables = new HashMap[4][4];


    public ResultTables() {
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

    public HashMap getMap(int r, int c) {
        return tables[r][c];
    }


}
