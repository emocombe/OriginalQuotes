package com.ernesternest.originalquotes;

import java.util.Random;

/**
 * Created by PC on 4/16/2016.
 */
public class FactBook {
   private String[] mfacts ={

            "",
            "Persistence is the only way to nurture success",
           "If your situation is disgusting then change  everything you do.",
           "Nothing is impossiable if you believe nothing is impossiable",
          "Showing thanks to god Makes life easy",




    };

    public String getfact(){


        String fact="";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mfacts.length);
        fact = mfacts[randomNumber];

        return fact;
    }
}
