package kr.or.kosa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//교재 509
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	private int boardnum;
	private String title;
	private String content;
}
