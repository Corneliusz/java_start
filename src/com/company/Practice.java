package com.company;

public class Practice {
    public String addToPizza(String top) {

        switch (top) {
            case "Tuna":
            case "Carrot":
                return "Great! You chose: "+top;
            case "Onion":
                return "We ran out of "+top+" Unfortunately";
            default :
               return "You can not put "+top+" on the pizza";
        }
    }
}
