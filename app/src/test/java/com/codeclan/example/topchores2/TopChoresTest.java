package com.codeclan.example.topchores2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by richardedwards on 24/05/2017.
 */
public class TopChoresTest {

    @Test
    public void canCreateTopChores(){
        TopChores topchores = new TopChores();
        ArrayList<String> chores = topchores.getList();
        assertEquals(10, chores.size());
        assertEquals("Make bed", chores.get(0));
        assertEquals("No fighting", chores.get(9));
    }

}