package taskFifteen;

public class TaskFifteen {
    public static void main(String[] args){
        System.out.println("Doing Task 15: Create a class called ‘Dishwasher’ that models a dishwasher. You can load dishes (one at a time) and unload dishes (all at once), and start and stop the dishwasher. You can't start it if it's empty, or it has unloaded clean dishes. You can't load dishes when it's running, or if you haven't unloaded clean dishes");

        Dishwasher dishwasher = new Dishwasher();
        dishwasher.start();
        dishwasher.addDish("plate");
        dishwasher.addDish("fork");
        dishwasher.addDish("spoon");
        dishwasher.getContents();
        dishwasher.getCleanStatus();
        dishwasher.start();
        dishwasher.addDish("bowl");
        dishwasher.stop();
        dishwasher.getCleanStatus();
        dishwasher.addDish("bowl");
        dishwasher.unload();
        dishwasher.getContents();
        dishwasher.addDish("bowl");
        dishwasher.getContents();

        System.out.println();
    }
}
