package com.movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
	
	private long id;
	private long movieId;
	private String movieTitle;
	private String seatName;
	
	private static final File file = new File("reservation.txt");
	
	
	public Reservation(long id, long movieId, String movieTitle, String seatName) {
		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.seatName = seatName;
	}

	public static Reservation findById(String reservationId) {
		Reservation r = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				if(reservationId.equals(temp[0])) {
					r = new Reservation(Long.parseLong(temp[0]), Long.parseLong(temp[1]), temp[2], temp[3]);
					break;
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public String toString() {
		return String.format("영화 : %s, 좌석 : %s\n", movieTitle, seatName);
	}

	public static Reservation cancel(String reservationId) throws IOException {
		Reservation canceled = null;
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		String text = "";
		
		while((line = reader.readLine()) != null) {
			String[] temp = line.split(",");
			if(reservationId.equals(temp[0])) {
				canceled = new Reservation(Long.parseLong(temp[0]), Long.parseLong(temp[1]), temp[2], temp[3]);
				continue;
			}
			text += line + "\n";
		}
		reader.close();
		FileWriter fw = new FileWriter(file);
		fw.write(text);
		fw.close();
		return canceled;
	}

	public static List<Reservation> findByMovieId(String movieIdStr) throws IOException {
		List<Reservation> reservations = new ArrayList<Reservation>();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line = reader.readLine()) != null){
			String[] temp = line.split(",");
			if(movieIdStr.equals(temp[1])) {
				long id = Long.parseLong(temp[0]);
				long movieid = Long.parseLong(temp[1]);
				String movieTitle = temp[2];
				String seatName = temp[3];
				
				Reservation reservation = new Reservation(id, movieid, movieTitle, seatName);
				reservations.add(reservation);
			}
		}
		reader.close();
		return reservations;
	}
	
	public Reservation(long movieId, String movieTitle, String seatName) {
		this.id = Instant.now().getEpochSecond();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.seatName = seatName;
	}
	

	public String getSeatName() {
		return seatName;
	}
	
	public Long getId() {
		return id;
		
	}

	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true);
		fw.write(this.toFileString() + "\n");
		fw.close();
	}

	private String toFileString() {
		return String.format("%d,%d,%s,%s",  id, movieId, movieTitle, seatName);
	}
}
