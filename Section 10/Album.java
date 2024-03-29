import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration)
    {
        if(findSong(title) == null)
        {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title)
    {
        for(Song checkSong: this.songs)
        {
            if(checkSong.getTitle().equals(title))
            {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int tracNumber, LinkedList<Song>playList)
    {
        int index = tracNumber - 1;
        if((index > 0) && (index <= this.songs.size()))
        {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + tracNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song>playList)
    {
        Song checkSong = findSong(title);
        if(checkSong != null)
        {
            playList.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
    
}