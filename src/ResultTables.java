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
            wTable = new HashMap<Integer, HashMap<Integer, Double[]>>();
            this.createIdealWomanMaps();
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

        HashMap<Integer, Double[]> hq = new HashMap<Integer, Double[]>();
        Double[] tab4 = {83.5, 85.5, 59.5, 93.5, 30.5, 46.5, 33.5, 31.5, 18.5, 79.0};
        Double[] tab5 = {86.5, 89.0, 61.5, 96.5, 31.5, 48.0, 34.5, 32.5, 19.0, 79.0};
        Double[] tab6 = {88.5, 93.0, 63.5, 99.0, 32.5, 49.5, 35.5, 33.5, 19.5, 79.0};
        hq.put(1, tab4);
        hq.put(2, tab5);
        hq.put(3, tab6);
        wTable.put(158, hq);

        HashMap<Integer, Double[]> hw = new HashMap<Integer, Double[]>();
        Double[] tab7 = {84.0, 86.0, 60.0, 94.0, 31.0, 47.0, 33.5, 31.5, 19.0, 80.0};
        Double[] tab8 = {87.0, 90.0, 62.0, 97.0, 32.0, 48.5, 34.5, 32.5, 19.5, 80.0};
        Double[] tab9 = {89.0, 93.5, 64.0, 99.5, 33.0, 50.0, 35.5, 33.5, 20.0, 80.0};
        hw.put(1, tab7);
        hw.put(2, tab8);
        hw.put(3, tab9);
        wTable.put(160, hw);

        HashMap<Integer, Double[]> he = new HashMap<Integer, Double[]>();
        Double[] tab10 = {84.5, 86.5, 60.5, 94.5, 31.0, 47.0, 34.0, 32.0, 19.5, 81.0};
        Double[] tab11 = {87.5, 90.5, 62.5, 97.5, 32.0, 48.5, 34.5, 33.0, 20.0, 81.0};
        Double[] tab12 = {89.5, 94.0, 64.5, 100.0, 33.0, 50.0, 35.5, 34.0, 20.5, 81.0};
        he.put(1, tab10);
        he.put(2, tab11);
        he.put(3, tab12);
        wTable.put(162, he);

        HashMap<Integer, Double[]> hr = new HashMap<Integer, Double[]>();
        Double[] tab13 = {85.0, 87.0, 61.0, 95.0, 31.5, 47.5, 34.0, 32.0, 19.5, 82.0};
        Double[] tab14 = {88.0, 91.0, 63.0, 98.0, 32.5, 49.0, 35.0, 33.0, 20.0, 82.0};
        Double[] tab15 = {90.0, 94.5, 65.0, 100.5, 33.5, 50.5, 36.0, 34.0, 20.5, 82.0};
        hr.put(1, tab13);
        hr.put(2, tab14);
        hr.put(3, tab15);
        wTable.put(164, hr);

        HashMap<Integer, Double[]> ht = new HashMap<Integer, Double[]>();
        Double[] tab16 = {85.5, 87.5, 61.5, 95.5, 31.5, 47.5, 34.5, 32.5, 20.0, 83.0};
        Double[] tab17 = {88.5, 91.5, 63.5, 98.5, 32.5, 49.0, 35.5, 33.5, 20.5, 83.0};
        Double[] tab18 = {90.5, 95.0, 65.5, 101.0, 33.5, 50.5, 36.5, 34.5, 21.0, 83.0};
        ht.put(1, tab16);
        ht.put(2, tab17);
        ht.put(3, tab18);
        wTable.put(166, ht);

        HashMap<Integer, Double[]> ha = new HashMap<Integer, Double[]>();
        Double[] tab19 = {86.0, 88.0, 62.0, 96.0, 32.0, 48.0, 34.5, 32.5, 20.0, 84.0};
        Double[] tab20 = {89.0, 92.0, 64.0, 99.0, 33.0, 49.5, 35.5, 33.5, 20.5, 84.0};
        Double[] tab21 = {91.0, 95.5, 66.0, 101.5, 34.0, 51.0, 36.5, 34.5, 21.0, 84.0};
        ha.put(1, tab19);
        ha.put(2, tab20);
        ha.put(3, tab21);
        wTable.put(168, ha);

        HashMap<Integer, Double[]> hs = new HashMap<Integer, Double[]>();
        Double[] tab22 = {87.0, 89.0, 63.0, 97.0, 32.0, 48.0, 35.5, 33.0, 20.5, 85.0};
        Double[] tab23 = {89.5, 92.5, 65.0, 100.0, 33.0, 49.5, 36.0, 34.0, 21.0, 85.0};
        Double[] tab24 = {92.0, 96.5, 67.0, 102.5, 34.0, 51.0, 37.0, 35.0, 21.5, 85.0};
        hs.put(1, tab22);
        hs.put(2, tab23);
        hs.put(3, tab24);
        wTable.put(170, hs);

        HashMap<Integer, Double[]> hd = new HashMap<Integer, Double[]>();
        Double[] tab25 = {88.0, 90.0, 64.0, 98.0, 32.0, 48.5, 35.,33., 20.5, 86. };
        Double[] tab26 = {91.0, 94., 66., 101., 33., 50., 36., 34., 21., 86.};
        Double[] tab27 = {93., 97.5, 68., 103.5, 34., 51.5, 37., 35., 21.5, 86.};
        hd.put(1, tab25);
        hd.put(2, tab26);
        hd.put(3, tab27);
        wTable.put(172, hd);

        HashMap<Integer, Double[]> hf = new HashMap<Integer, Double[]>();
        Double[] tab28 = {89., 91., 65., 99., 32., 48.5, 35.5, 33.5, 21., 87.};
        Double[] tab29 = {91.5, 94.5, 67., 101.5, 33., 50., 36.5, 34.5, 21.5, 87.};
        Double[] tab30 = {94., 98.5, 69., 104.5, 32., 51.5, 37.5, 35.5, 22., 87.};
        hf.put(1, tab28);
        hf.put(2, tab29);
        hf.put(3, tab30);
        wTable.put(174, hf);

        HashMap<Integer, Double[]> hy = new HashMap<Integer, Double[]>();
        Double[] tab31 = {90., 92., 66., 100., 32.5, 49., 35.5, 33.5, 21., 88.};
        Double[] tab32 = {93., 96., 68., 103., 33.5, 50.5, 36.5, 34.5, 21.5, 88.};
        Double[] tab33 = {95., 99.5, 70., 105.5, 34.5, 52., 37.5, 35.5, 22., 88.};
        hy.put(1, tab31);
        hy.put(2, tab32);
        hy.put(3, tab33);
        wTable.put(176, hy);

        HashMap<Integer, Double[]> h = new HashMap<Integer, Double[]>();
        Double[] tab34 = {91., 93., 67., 101., 32.5, 49., 36., 34., 21.5, 89.};
        Double[] tab35 = {93.5, 96.5, 69., 103.5, 33.5, 50.5, 37., 35., 22., 89.};
        Double[] tab36 = {96., 100.5, 71., 106.5, 34.5, 53., 38., 36., 22.5, 89.};
        h.put(1, tab34);
        h.put(2, tab35);
        h.put(3, tab36);
        wTable.put(178, h);
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

    public Double[] getIdealMenMap(double key) {
        return table.get(key);
    }

    public HashMap<Integer, Double[]> getIdealWomenMap(int key) {
        return wTable.get(key);
    }
}
