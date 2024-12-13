package com.example.application;

// Current project: Tes

public class Main {
    private static boolean live;

    protected static boolean isLive() {
        return live;
    }

	public static void main(String[] args){
        live = false;
        for (int i = 0; i < 99999; i++) {
            System.out.println("isLive: " + isLive());
        }
	}
	
}
