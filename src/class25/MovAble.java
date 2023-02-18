package class25;

public interface MovAble {
    void move();
}
        interface OwnAble{
    void own();
}

    class Car implements MovAble, OwnAble{
        @Override
        public void move() {
        System.out.println(" I can move");
    }
        @Override
        public void own() {
            System.out.println("You can own me");
        }
    }

    class  Dog implements MovAble, OwnAble{

            @Override
            public void move() {
                System.out.println("I can move");
    }
            @Override
            public void own() {
                System.out.println("you can own me");
            }



            public static void main(String[] args) {

                OwnAble [] ownables={new Dog(), new Car()};

                for(OwnAble ow: ownables){

                    ow.own();
                }

        }
    }
