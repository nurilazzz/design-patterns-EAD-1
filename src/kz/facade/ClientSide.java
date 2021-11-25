package kz.facade;

import kz.facade.db.Post;
import kz.facade.db.PostDB;
import kz.facade.subsystems.CourierCenterSystem;
import kz.facade.subsystems.TastamatCenterSystem;
import kz.facade.subsystems.transport.AirTransport;
import kz.facade.subsystems.transport.TrainTransport;
import kz.facade.subsystems.transport.TransportCenterSystem;
import kz.facade.subsystems.transport.TruckTransport;

import java.rmi.activation.UnknownObjectException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientSide {
    public static final Scanner sc = new Scanner(System.in);
    public static final PostDB postDB = PostDB.getInstance();

    public static void main(String[] args) {
        boolean loopOn = true;
        while (loopOn) {
            System.out.println("Enter 1 to deliver a post");
            System.out.println("Enter 2 for post operations");
            System.out.println("Enter 3 to exit");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                continue;
            }
            if (!(choice >= 1 && 4 >= choice)) {
                System.out.println("Select the number listed below");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter your post id or -1 for exit: ");
                    System.out.println(postDB.getPosts());
                    int postId = sc.nextInt();
                    if(postId == -1) {
                        break;
                    }
                    chooseDelivery(postId);
                    break;
                case 2:
                    postOperations();
                    break;
                case 3:
                    System.out.println("♡ Good bye ♡");
                    loopOn = false;
                    break;
            }
        }
    }

    public static void postOperations() {
        boolean loopOn = true;
        while (loopOn) {
            System.out.println("Enter 1 to create a post");
            System.out.println("Enter 2 to remove a post");
            System.out.println("Enter 3 to list posts");
            System.out.println("Enter 4 back");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                continue;
            }
            if (!(choice >= 1 && 4 >= choice)) {
                System.out.println("Select the number listed below");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter the name: ");
                    String postName = sc.next();
                    System.out.println("Enter the description: ");
                    String postDescription = sc.next();

                    Post newPost = new Post(postName, postDescription);
                    postDB.savePost(newPost);
                    loopOn = false;
                    break;
                case 2:
                    System.out.println("Enter an id of a post");
                    int postId = sc.nextInt();
                    postDB.deletePostById(postId);
                    loopOn = false;
                    break;
                case 3:
                    postDB.getPosts().forEach(System.out::println);
                    loopOn = false;
                    break;
                case 4:
                    loopOn = false;
                    break;
            }
        }
    }

    public static void chooseDelivery(int postId) {
        boolean loopOn = true;
        while (loopOn) {
            System.out.println("Enter 1 for delivery by courier service");
            System.out.println("Enter 2 for pickup at tastamat center");
            System.out.println("Enter 3 back");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                continue;
            }
            if (!(choice >= 1 && 3 >= choice)) {
                System.out.println("Select the number listed below");
                continue;
            }
            TransportCenterSystem transportCenterSystem = null;
            boolean transportSelected = false;
            try{
                transportCenterSystem = chooseTransportType();
                transportSelected = true;
            } catch (UnknownObjectException e) {
                if(e.getLocalizedMessage().equals("Choosed back")) {
                    continue;
                }
            }
            PostOfficeSystem postOffice;
            switch (choice) {
                case 1:
                    if(!transportSelected){
                        postOffice = new PostOfficeSystem(new CourierCenterSystem(), postId);
                        postOffice.deliver();
                    }else {
                        postOffice = new PostOfficeSystem(new CourierCenterSystem(),transportCenterSystem, postId);
                        postOffice.deliverByTransport();
                    }
                    System.out.print("\r" + postDB.getPostById(postId).getDescription() + "\n");
                    loopOn = false;
                    break;
                case 2:
                    if(!transportSelected){
                        postOffice = new PostOfficeSystem(new TastamatCenterSystem(), postId);
                        postOffice.deliver();
                    }else {
                        postOffice = new PostOfficeSystem(new TastamatCenterSystem(),transportCenterSystem, postId);
                        postOffice.deliverByTransport();
                    }
                    postOffice.deliver();
                    System.out.print("\r" + postDB.getPostById(postId).getDescription() + "\n");
                    loopOn = false;
                    break;
                case 3:
                    loopOn = false;
                    break;
            }
        }
    }
    public static TransportCenterSystem chooseTransportType() throws UnknownObjectException {
        while (true) {
            System.out.println("Enter 1 for transport by truck");
            System.out.println("Enter 2 for transport by train");
            System.out.println("Enter 3 for transport by air");
            System.out.println("Enter 4 for transport by usual way");
            System.out.println("Enter 5 back");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                continue;
            }
            if (!(choice >= 1 && 5 >= choice)) {
                System.out.println("Select the number listed below");
                continue;
            }
            switch (choice) {
                case 1:
                    return new TruckTransport();
                case 2:
                    return new TrainTransport();
                case 3:
                    return new AirTransport();
                case 4:
                    throw new UnknownObjectException("Usual way");
                case 5:
                    throw new UnknownObjectException("Choosed back");
            }
        }
    }
}
