import java.util.HashMap;
import java.util.Vector;

import static java.lang.Double.*;

/**
 * Created by Dante on 07.01.2016.
 */
public class PotencyLogic {

    private Vector answers;
    ResultForm form;
    ResultTables rt;


    public PotencyLogic(Vector answers, ResultForm form) {
        this.answers = answers;
        this.form = form;
        this.rt = new ResultTables();
    }


    public void countCircuits() {
        String str = answers.elementAt(3).toString();
        double wristCircuit = parseDouble(str);
        double chestCircuit = wristCircuit * 6.5;
        form.setArmField(wristCircuit * 6.5);
        form.setBiodraField(chestCircuit * 0.85);
        form.setChestField(chestCircuit);
        form.setForearmField(chestCircuit * 0.29);
        form.setHeapField(chestCircuit * 0.53);
        form.setKneeField(chestCircuit * 0.34);
        form.setNeckField(chestCircuit * 0.37);
        form.setTalyField(chestCircuit * 0.29);
    }

    public void chooseGain() {
        double result = 0;
        String resultStr;
        String ageStr = answers.elementAt(0).toString();
        int age = Integer.parseInt(ageStr);
        String trainingStr = answers.elementAt(1).toString();
        int training = Integer.parseInt(trainingStr);
        String typeStr = answers.elementAt(2).toString();
        int type = Integer.parseInt(typeStr);

        HashMap hm = rt.getMap(training-1, age-1);
        if(type == 1) {
            resultStr = hm.get("ekto").toString();
            result = parseDouble(resultStr);
            form.setResultField(result);
        } else if( type == 2) {
            resultStr = hm.get("mezo").toString();
            result = parseDouble(resultStr);
            form.setResultField(result);
        } else if(type == 3) {
            resultStr = hm.get("endo").toString();
            result = parseDouble(resultStr);
            form.setResultField(result);
        }
    }
}
