package bjs.task23;

/**
 * Presents egg's voice
 */
class Egg extends Thread
{
    @Override public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                //Sleep thread for 1 sec
                sleep(1000);
            }
            catch(InterruptedException e) {}

            System.out.println("Egg was before!");
        }
    }
}

/**
 * Presents chicken's voice
 */
class Chicken implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                //Sleep thread for 1 sec
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {}

            System.out.println("Chicken was before!");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Start discussion...");

        Egg eggVoice = new Egg();
        eggVoice.start();

        Thread chickenVoice = new Thread(new Chicken());
        chickenVoice.start();
    }
}

/*
Start discussion...
Egg was before!
Chicken was before!
Chicken was before!
Egg was before!
Chicken was before!
Egg was before!
Egg was before!
Chicken was before!
Chicken was before!
Egg was before!
 */
