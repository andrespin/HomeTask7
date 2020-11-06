package Block1;

    class Cat {
    private String name ;
    private int appetite ;
    private boolean satiety = false;

    boolean isSatiety() {
        return satiety;
    }

    String getName() {
        return name;
    }

    Cat (String name , int appetite ) {
        this.name = name ;
        this.appetite = appetite ;
    }
    void eat(Plate plate)
    {
        if (plate.getFood() >= appetite )
        {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println("Сытость кота: " + satiety);
        }
        else{
            System.out.println("Не хватает еды в тарелке");
            }

    }

}