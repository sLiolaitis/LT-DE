package com.company;

import java.util.ArrayList;

public class Lt {

    private String lygis;
    private ArrayList<String> zodziai;

    public Lt(String lygis) {
        this.lygis = lygis;
        this.zodziai = new ArrayList<String>();
    }

    public void pridetiZodi (String zodis) {
        zodziai.add(zodis);
    }

    public String getZodi (int i) {
        return zodziai.get(i);
    }

    public boolean arTeisingai (int i, String zodis) {
        if (getZodi(i).equals(zodis)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getArraySize () {
        return zodziai.size();
    }

}
