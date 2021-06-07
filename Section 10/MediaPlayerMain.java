import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MediaPlayerMain
{
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Beep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.8);
        album.addSong("Holy man", 3.6);
        album.addSong("Lady double dealer", 3.0);
        album.addSong("You can't do it right", 3.8);
        album.addSong("High ball shooter", 4.7);
        album.addSong("The gypsy", 5.3);
        album.addSong("Soldier of fortune", 6.6);
        albums.add(album);

        album = new Album("For those about reck", "AC/DC");
        album.addSong("I put the trigger on you", 5.44);
        album.addSong("Lets go", 3.32);
        album.addSong("Inject the venom", 5.43);
        album.addSong("Snowballed", 5.13);
        album.addSong("Evil walks", 3.56);
        album.addSong("C.O.D", 5.09);
        album.addSong("Breaking the rules", 4.54);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can't do it right", playList);
        albums.get(0).addToPlaylist("Holy man", playList);
        albums.get(0).addToPlaylist("Speed king", playList);
        albums.get(0).addToPlaylist(6, playList);
        albums.get(1).addToPlaylist("Evil walks", playList);
        albums.get(1).addToPlaylist("3", playList);
        albums.get(1).addToPlaylist("24", playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList)
    {
        Scanner scanner =new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0)
        {
            System.out.println("No song in playlist");
            return;
        }
        else
        {
            System.out.println("Now playing " + listIterator.next().toString());
        }
        
        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action)
            {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                
                case 1:
                    if(!forward)
                    {
                        if(listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext())
                    {
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else
                    {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward = false;
                        if(listIterator.hasPrevious())
                        {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                        else
                        {
                            System.out.println("We are at the start of the playlist");
                            forward = true;
                        }
                    }
                    break;    
                 
                case 3:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }
                        else
                        {
                            System.out.println("We are at the start of the list");
                        }
                    }
                    else
                    {
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        }
                        else
                        {
                            System.out.println("We have reached the end of list");
                        }
                    }
                    break;
                case 4: printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0)
                    {
                        listIterator.remove();
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if(listIterator.hasPrevious())
                        {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }

        }
    
    }

    private static void printMenu()
    {
        System.out.println("Available actions: \n press");
        System.out.println("0 - to quit\n " +
         "1 - to play next song\n " +
         "2 - to play previous song\n " +
         "3 - to replay the current song \n" +
         "4 - list song in the playlist \n" +
         "5 - print available actions." +
         "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> pLinkedList)
    {
        Iterator<Song> iterator = pLinkedList.iterator();
        System.out.println("==========================");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("==========================");
    }

}