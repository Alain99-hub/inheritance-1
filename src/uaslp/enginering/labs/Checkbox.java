package uaslp.enginering.labs;

import static java.lang.System.*;

public class Checkbox extends Control{
 private String label;

    public Checkbox(String label) {
        this.label = label;
    }
    public void draw(){
        out.print("[ ]" + label );
    }
}
