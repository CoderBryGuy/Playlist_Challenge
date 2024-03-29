/*
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorDemo {




    public class Main {

        public static void main(String[] args) {
            LinkedList<String> placesToVisit = new LinkedList<>();

            addInOrder(placesToVisit,"Sydney" );
            addInOrder(placesToVisit,"Melbourne" );
            addInOrder(placesToVisit,"Brisbane" );
            addInOrder(placesToVisit,"Perth");
            addInOrder(placesToVisit,"Canberra");
            addInOrder(placesToVisit,"Adelaide");
            addInOrder(placesToVisit,"Darwin");

            printlist(placesToVisit);

            placesToVisit.add(1, "Alice Springs");
            printlist(placesToVisit);

            placesToVisit.remove(4);
            printlist(placesToVisit);

            visit(placesToVisit);
        }

        private static void printlist(LinkedList<String> linkedList) {

            Iterator<String> i = linkedList.iterator();
            while(i.hasNext()){
                System.out.println("Now visiting " + i.next());
            }
            System.out.println("===========================");
        }

        private static void visit(LinkedList<String> cities){
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean goingForward = true;
            ListIterator<String> listIterator = cities.listIterator();

            if(cities.isEmpty()){
                System.out.println("No cities ");
            }else {
                System.out.println("Now visiting " + listIterator.next());
                printMenu();
            }

            while(!quit){
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action){
                    case 0:
                        System.out.println("Holiday vacation is over");
                        quit = true;
                        break;
                    case 1:
                        if(!goingForward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            goingForward = true;
                        }
                        if(listIterator.hasNext()) {
                            System.out.println("Now visiting " + listIterator.next());
                        } else {
                            System.out.println("Reached the end of list");
                            goingForward = false;
                        }
                        break;
                    case 2:
                        if(goingForward){
                            if(listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            goingForward = false;
                        }
                        if(listIterator.hasPrevious()){
                            System.out.println("Now visiting " + listIterator.previous());
                        }else {
                            System.out.println("We are at the start of the list");
                            goingForward = true;
                        }
                        break;
                    case 3:
                        printMenu();
                        break;
                }
            }
        }

        private static void printMenu() {
            System.out.println("Available actions: \n press ");
            System.out.println("0 - quit\n" +
                    "1 - got to next city\n" +
                    "2- to previous city\n" +
                    "3 - print menu options");
        }

        private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
            ListIterator<String> stringListIterator =  linkedList.listIterator();

            while(stringListIterator.hasNext()){
                int comparison = stringListIterator.next().compareTo(newCity);
                if(comparison == 0){
                    System.out.println(newCity + " is already included");
                    return false;
                }else if(comparison > 0){
                    //new city should appear before this one
                    stringListIterator.previous();
                    stringListIterator.add(newCity);
                    return true;
                }else if (comparison < 0){
                    // move on to next city
                }
            }
            stringListIterator.add(newCity);
            return true;
        }
    }









}
*/
