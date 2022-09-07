import java.util.LinkedList;

class main {
    public static void main(String[] args){
    
    //Create new linkelist;
    LinkedList<String> Playlist = new LinkedList<>();

    //Add a new song to Playlist
    Playlist.add("Mapa");
    Playlist.add("WYAT");
    Playlist.add("Bulan");
    Playlist.add("La Luna");
    Playlist.add("Pare Ko");

    //Add new song at the front of the Playlist
    Playlist.addFirst("Spolarium");

    //Add a new song at the end of the Playlist
    Playlist.addLast("Pangarap Lang Kita");

    //Display the song at the front in the LinkedList
    System.out.println(Playlist.get(0));

    //Replace the last song using the set() method
    Playlist.set(6, "Sa Susunod na Habang Buhay");

    //Remove the first song using the remove() method
    Playlist.remove(0);

    //Display all the songs in Playlist
    System.out.println("Updated Playlist:" + Playlist);


 }

}
