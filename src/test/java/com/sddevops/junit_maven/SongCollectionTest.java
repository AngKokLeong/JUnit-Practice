package com.sddevops.junit_maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SongCollectionTest {
    
    private SongCollection songCollection;
    private Song s1; 
    private Song s2; 
    private Song s3;
    private Song s4;

    private final int SONG_COLLECTION_SIZE = 4;

    @BeforeEach
    void setUp() throws Exception{

        songCollection = new SongCollection(4);
        s1 = new Song("001", "good 4 u", "Olivia Rodrigo", 3.59);
        s2 = new Song("002", "Peaches", "Justin Bieber", 3.18);
        s3 = new Song("003", "MONTERO", "Lil Nas", 2.3);
        s4 = new Song("004", "bad guy", "billie eilish", 3.14);

        songCollection.addSong(s1);
        songCollection.addSong(s2);
        songCollection.addSong(s3);
        songCollection.addSong(s4);

    }



    @Test
    void testAddSong(){
        List<Song> testSongCollection = songCollection.getSongs();

        Song testSong = new Song("005", "TEST", "TEST", 9.00);
        
        assertEquals(testSongCollection.size(), SONG_COLLECTION_SIZE);
        
        songCollection.addSong(testSong);
        
        assertFalse(songCollection.getSongs().size() == SONG_COLLECTION_SIZE + 1);
    }





}
