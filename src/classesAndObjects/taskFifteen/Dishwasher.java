package classesAndObjects.taskFifteen;

import java.util.*;

public class Dishwasher {
    OperatingStatus operatingStatus = OperatingStatus.STOPPED;
    CleanStatus cleanStatus = CleanStatus.CLEAN;
    List<String> content = new ArrayList<>();

    boolean isEmpty(){
        return content.isEmpty();
    }

    boolean isClean(){
        return cleanStatus.equals(CleanStatus.CLEAN);
    }

    boolean isWorking(){
        return operatingStatus.equals(OperatingStatus.WORKING);
    }

    void start(){
        if (isEmpty()){
            System.out.println("Can't start; add some dishes first!");
            return;
        }
        if (isWorking()){
            System.out.println("Already working!");
            return;
        }
        if (isClean()){
            System.out.println("Already clean!");
            return;
        }
        operatingStatus = OperatingStatus.WORKING;
        System.out.println("Dishwasher started.");
    }

    void stop(){
        operatingStatus = OperatingStatus.STOPPED;
        cleanStatus = CleanStatus.CLEAN;
        System.out.println("Dishwasher stopped.");
    }

    void unload(){
        content.clear();
    }

    void getContents(){
        System.out.println(content.toString());
    }

    void getOperationalStatus(){
        System.out.println(operatingStatus.toString());
    }

    void getCleanStatus(){
        System.out.println(cleanStatus.toString());
    }

    void addDish(String dish){
        if (isClean() && !isEmpty()){
            System.out.println("The dishes are clean. Please unload them first!");
            return;
        }
        if (isWorking()) {
            System.out.println("The dishwasher is running. Please wait the washing process is finished.");
            return;
        }
        content.add(dish);
        cleanStatus = CleanStatus.DIRTY;
        System.out.println("You have successfully put " + dish + " into the dishwasher.");
    }
}
