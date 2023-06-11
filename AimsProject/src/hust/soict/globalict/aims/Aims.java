package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;

import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int location = 1 , num = 0, preLocation = 1;
        Store store = new Store();
        Cart cart = new Cart();
        Media curMedia = null;
        for (;;) {
            if (location == 1) {
                showMenu();
                System.out.println("Please choose option: ");
                int firstOption = scanner.nextInt();
                if (firstOption == 0) {
                    break;
                } else if (firstOption == 1) {
                    location = 2;
                    continue;
                }
                else if (firstOption == 2) {
                    scanner.nextLine();
                    System.out.println("What do you want to do ?");
                    String addOrRemove = scanner.nextLine();
                    if (addOrRemove.equalsIgnoreCase("remove")) {
                        System.out.println("Choose the item that you want to remove: ");
                        String title = scanner.nextLine();
                        store.removeMedia(title);
                    }
                    else if (addOrRemove.equalsIgnoreCase("add")) {
                        System.out.println("Choose the type of item: ");
                        String typeOfItem = scanner.nextLine();
                        if (typeOfItem.equalsIgnoreCase("CD")) {
                            System.out.print("Enter title : ");
                            String title = scanner.nextLine();
                            System.out.print("Enter category : ");
                            String category = scanner.nextLine();
                            System.out.print("Enter cost : ");
                            float cost = scanner.nextFloat();
                            scanner.nextLine();
                            System.out.print("Enter director : ");
                            String director = scanner.nextLine();
                            System.out.print("Enter length : ");
                            int length = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter artist : ");
                            String artist = scanner.nextLine();
                            num++;
                            CompactDisc cd = new CompactDisc(num, title, category, director, length, cost, artist);
                            store.addMedia(cd);
                        }
                        else if (typeOfItem.equalsIgnoreCase("dvd")) {
                            System.out.print("Enter title : ");
                            String title = scanner.nextLine();
                            System.out.print("Enter category : ");
                            String category = scanner.nextLine();
                            System.out.print("Enter cost : ");
                            float cost = scanner.nextFloat();
                            scanner.nextLine();
                            System.out.print("Enter director : ");
                            String director = scanner.nextLine();
                            System.out.print("Enter length : ");
                            int length = scanner.nextInt();
                            num++;
                            DigitalVideoDisc dvd = new DigitalVideoDisc(num, title , category , director , length , cost);
                            store.addMedia(dvd);
                            continue;
                        }
                        else if (typeOfItem.equalsIgnoreCase("book")) {
                            System.out.print("Enter title : ");
                            String title = scanner.nextLine();
                            System.out.print("Enter category : ");
                            String category = scanner.nextLine();
                            System.out.print("Enter cost : ");
                            float cost = scanner.nextFloat();
                            scanner.nextLine();
                            num++;
                            Book book = new Book(num , title , category , cost);
                            store.addMedia(book);
                            continue;
                        }
                        else {
                            System.out.println("Invalid ");
                            continue;
                        }
                    }
                    else {
                        System.out.println("Invalid");
                        continue;
                    }
                }
                else if (firstOption == 3) {
                    location = 4;
                    preLocation = 1;
                    continue;
                }
            }
            else if (location == 2) {
                store.print();
                storeMenu();
                System.out.println("Please choose option: ");
                int secondOption = scanner.nextInt();
                if (secondOption == 0) {
                    location = 1;
                    continue;
                }
                else if (secondOption == 1) {
                    scanner.nextLine();
                    System.out.println("Enter the title: ");
                    String title = scanner.nextLine();
                    Media item = store.searchMedia(title);
                    if (item != null) {
                        curMedia = item;
                        location = 3;
                    }
                    else {
                        System.out.println("Invalid");
                        continue;
                    }
                    continue;
                }
                else if (secondOption == 2) {
                    scanner.nextLine();
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    Media item = store.searchMedia(title);
                    if (item == null) {
                        System.out.println("Invalid");
                        continue;
                    }
                    else {
                        cart.addMedia(item);
                        System.out.println("The number items in the cart is: " + cart.size());
                    }
                    continue;
                }
                else if (secondOption == 3) {
                    scanner.nextLine();
                    System.out.println("Choose the title of the media");
                    String title = scanner.nextLine();
                    Media tmp = store.searchMedia(title);
                    if (tmp == null) {
                        System.out.println("Invalid");
                        continue;
                    }
                    else {
                        if (tmp instanceof DigitalVideoDisc) ((DigitalVideoDisc) tmp).play();
                        else if (tmp instanceof CompactDisc) ((CompactDisc) tmp).play();
                        else System.out.println("Invalid");
                        continue;
                    }
                }
                else if (secondOption == 4) {
                    location = 4;
                    preLocation = 2;
                    continue;
                }
            }
            else if (location == 3) {
                System.out.println("Information of item: " + curMedia.toString());
                mediaDetailsMenu();
                System.out.println("Please choose option: ");
                int thirdOption = scanner.nextInt();
                if (thirdOption == 0) {
                    location = 2;
                    continue;
                }
                else if (thirdOption == 1) {
                    cart.addMedia(curMedia);
                    System.out.println("The number of item in cart is: " + cart.size());
                }
                else if (thirdOption == 2) {
                    if (curMedia instanceof DigitalVideoDisc) ((DigitalVideoDisc) curMedia).play();
                    else if (curMedia instanceof CompactDisc) ((CompactDisc) curMedia).play();
                    else {
                        System.out.println("Invalid");
                        continue;
                    }
                }
            }
            else if (location == 4) {
                cartMenu();
                System.out.println("Please choose option: ");
                int lastOption = scanner.nextInt();
                if (lastOption == 0) {
                    location = preLocation;
                    continue;
                }
                else if (lastOption == 1) {
                    scanner.nextLine();
                    System.out.println("Please choose the type of filtering (id or title): ");
                    String type = scanner.nextLine();
                    if (type.equalsIgnoreCase("id")) {
                        System.out.println("Please choose the ID: ");
                        int id = scanner.nextInt();
                        Media result = cart.search(id);
                        if (result == null) {
                            System.out.println("Invalid");
                            continue;
                        }
                        else {
                            System.out.println("Information of item is: " + result.toString());
                            continue;
                        }
                    }
                    else if (type.equalsIgnoreCase("title")) {
                        System.out.println("Please choose the title: ");
                        String title = scanner.nextLine();
                        Media result = cart.search(title);
                        if (result == null) {
                            System.out.println("Invalid");
                            continue;
                        }
                        else {
                            System.out.println("Information of item is: " + result.toString());
                            continue;
                        }
                    }
                }
                else if (lastOption == 2) {
                    scanner.nextLine();
                    System.out.println("Please choose the way that the cart will be sorted ");
                    String way = scanner.nextLine();
                    if (way.equalsIgnoreCase("by cost")) {
                        cart.sortByCost();
                        cart.Print();
                    }
                    else if (way.equalsIgnoreCase("by title")) {
                        cart.sortByTitle();
                        cart.Print();
                    }
                    else {
                        System.out.println("Invalid");
                        continue;
                    }
                }
                else if (lastOption == 3) {
                    scanner.nextLine();
                    System.out.println("Choose the media that you want to remove ");
                    String title = scanner.nextLine();
                    cart.removeMedia(title);
                }
                else if (lastOption == 4) {
                    scanner.nextLine();
                    System.out.println("Choose the media that you want to play ");
                    String title = scanner.nextLine();
                    Media result = cart.search(title);
                    if (result instanceof DigitalVideoDisc) ((DigitalVideoDisc) result).play();
                    else if (result instanceof CompactDisc) ((CompactDisc) result).play();
                    else {
                        System.out.println("Invalid");
                    }
                }
                else if (lastOption == 5) {
                    scanner.nextLine();
                    System.out.println("An order is created");
                    cart.ClearCart();
                }
            }
        }
    }
}
