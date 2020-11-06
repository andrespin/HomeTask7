package Block2;

public class Cat {

    private String name ;
    private int appetite ;
    private int satietyScale;
    private boolean satiety = false;

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatietyScale() {
        return satietyScale;
    }

    public void setSatietyScale(int satietyScale) {
        this.satietyScale = satietyScale;
    }

    boolean getSatiety() {
        return satiety;
    }

    String getName() {
        return name;
    }

    Cat (String name , int appetite ) {
        this.name = name ;
        this.appetite = appetite ;
    }

    Cat () {
        this.name = "No name" ;
        this.appetite = 200 ;
    }






    void eat(Plate plate)
    {
        if (plate.getFood() >= appetite )
        {
            plate.decreaseFood(appetite);
            satiety = true;
            setSatietyScale(appetite);
            System.out.println("Сытость кота: " + satiety);
        }

        else{
            setSatietyScale(plate.getFood());
            plate.decreaseFood(plate.getFood());
            System.out.println("Не хватает еды в тарелке, чтобы насытиться коту"
                    + " кот съел только: " + getSatietyScale());
        }
    }

    void eat(Plate[] plates, Cat [] cats)
    {
        int totalFood = countTotalFood(plates);
        int totalAppetite = countTotalAppetite(cats);


        if (totalFood == totalAppetite)
        {

            for (int i = 0; i < cats.length; i++)
            {

            }


            for (int i = 0; i < plates.length; i++)
            {
                plates[i].setFood(0);
            }
        }



        /*
        if (plate.getFood() >= appetite )
        {
            plate.decreaseFood(appetite);
            satiety = true;
            setSatietyScale(appetite);
            System.out.println("Сытость кота: " + satiety);
        }

        else{
            setSatietyScale(plate.getFood());
            plate.decreaseFood(plate.getFood());
            System.out.println("Не хватает еды в тарелке, чтобы насытиться коту"
                    + " кот съел только: " + getSatietyScale());
        }
        */
    }

    private int countTotalAppetite(Cat [] cats)
    {
        int totalAppetite = 0;
        for (int i = 0; i < cats.length; i++ )
        {
            totalAppetite += cats[i].getAppetite();
        }
        return totalAppetite;

    }

    private int countTotalFood(Plate [] plates)
    {
        int totalFood = 0;
        for (int i = 0; i < plates.length; i++ )
        {
            totalFood += plates[i].getFood();
        }
        return totalFood;
    }





}
