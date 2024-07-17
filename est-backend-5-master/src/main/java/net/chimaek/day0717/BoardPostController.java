package net.chimaek.day0717;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board-post")
public class BoardPostController {

	private final BoardPostService boardPostService;

	@Autowired
	public BoardPostController(BoardPostService boardPostService) {
		this.boardPostService = boardPostService;
	}

	@PostMapping
	public ResponseEntity<BoardPostDTO> createBoardPost(@RequestBody BoardPostDTO boardPostDTO) {
		BoardPostDTO createdBoardPostDTO = boardPostService.createBoardPost(boardPostDTO);
		return ResponseEntity.ok(createdBoardPostDTO);
	}
}
