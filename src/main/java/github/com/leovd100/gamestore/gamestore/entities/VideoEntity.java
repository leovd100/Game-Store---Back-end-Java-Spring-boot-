package github.com.leovd100.gamestore.gamestore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "videos")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Path_video")
	private String pathVideo;
	
	@Column(name = "Path_background")
	private String pathBackGround;
	
	
	@Column(name = "Path_Person")
	private String pathPerson;
	

}
