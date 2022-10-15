package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private  int extraToppingsPrice;
    private int takeAwayPrice;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseAdded = false;
        this.isToppingAdded=false;
        this.isTakeAwayAdded = false;


        this.extraCheesePrice =80;
        this.takeAwayPrice =20;

        if(isVeg == true){
            this.price = 300;
            this.extraToppingsPrice =70;
        }
        else{
            this.price =400;
            this.extraToppingsPrice=120;
        }

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       if(isCheeseAdded == false){
           this.bill = this.bill +"Extra Cheese Added: "+ this.extraCheesePrice + "\n";
           this.price = this.price +  this.extraCheesePrice;
           isCheeseAdded = true;
       }
    }
    public void addExtraToppings(){
           if (isToppingAdded == false){
               this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice +"\n";
               this.price =this.price + this.extraToppingsPrice;
               isToppingAdded = true;
           }
    }
    public void addTakeaway(){
        if(isTakeAwayAdded == false){
            this.bill = this.bill +"Paperbag Added: "+ this.takeAwayPrice + "\n";
            this.price =this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        if(isBillGenerated == false){
            isBillGenerated = true;
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
