package com.barabam.dailyquiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private long id;
	private String title;
	private String author;
	private int publicationYear;
}
