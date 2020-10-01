package uaslp.enginering.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListBox extends  Control{
  private List<String> options;

    public ListBox(String ... options) {
        this.options = new ArrayList<>(options.length) ;

        this.options.addAll(Arrays.asList(options));

    }

    @Override
    protected void draw() {
        for(String option: options){
            System.out.print(option + " - ");
        }
    }
}
