package Block1;

 class Plate {

    private int food;

    int getFood() {
        return food;
    }

    Plate ( int food ) {
        this.food = food ;
    }
    void info () {
        System.out.println("plate: " + food);
    }

    void decreaseFood ( int n ) {

        if (food - n >= 0)
        {
            food -= n ;
        }
        else {
            System.out.println("Больше нет еды в тарелке");
        }

    }

    void increaseFood(int n) {
        food += n ;
    }

}