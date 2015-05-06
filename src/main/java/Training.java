/**
 * Created by werwolf on 07.05.15.
 */
class Box {
        double width;
        double height;
        double depth;
        }

class Training {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.depth = 20;
        mybox1.height = 30;

        //присвоить значения переменным экземпляра mybox2

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //рассчитать объем первого параллелепипеда

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }


    }
