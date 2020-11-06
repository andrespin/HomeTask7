package Block2;

    class EatingProcess {

    void eat(Plate[] plates, Cat [] cats)
    {
        int totalFood = countTotalFood(plates);
        int totalAppetite = countTotalAppetite(cats);
        giveFoodToCats(plates, cats, totalFood, totalAppetite);
    }

    private void giveFoodToCats(Plate[] plates, Cat [] cats, int totalFood, int totalAppetite)
    {
        if (totalFood == totalAppetite)
        {
            for (int i = 0; i < cats.length; i++)
            {
                cats[i].setSatietyScale(cats[i].getAppetite());
                cats[i].setSatiety(true);
            }

            for (int i = 0; i < plates.length; i++)
            {
                plates[i].setFood(0);
            }
        }
        else if (totalFood < totalAppetite)
        {
            for (int i = 0; i < cats.length; i++)
            {
                if (totalFood >= cats[i].getAppetite())
                {
                    totalFood -= cats[i].getAppetite();
                    cats[i].setSatietyScale(cats[i].getAppetite());
                    cats[i].setSatiety(true);
                }
                else
                {
                    cats[i].setSatietyScale(totalFood);
                }
            }
        }
        else
        {
            for (int i = 0; i < cats.length; i++)
            {
                if (totalFood >= cats[i].getAppetite())
                {
                    totalFood -= cats[i].getAppetite();
                    cats[i].setSatietyScale(cats[i].getAppetite());
                    cats[i].setSatiety(true);
                }
            }
        }
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
