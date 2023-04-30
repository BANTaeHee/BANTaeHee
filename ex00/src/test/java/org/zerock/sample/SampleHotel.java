package org.zerock.sample;
// 기존과 달리 생성자를 선언하고 Chef를 주입하도록 작성되었음.
// 기존과 다른 점은 @Autowired 어노테이션이 없이 처리되고 있다는 점
import org.springframework.stereotype.Component;

//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class SampleHotel {
	
	@NonNull
	private Chef chef;
	
//	public SampleHotel(Chef chef) {
//		
//		this.chef = chef;
//	}

}
