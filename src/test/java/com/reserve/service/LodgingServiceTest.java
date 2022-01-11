package com.reserve.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.reserve.model.Criteria;
import com.reserve.model.LodgingVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class LodgingServiceTest {
	
	@Autowired
	LodgingService service;
	
	// 숙소 상세 정보
	@Test
	public void getLodgingInfoTest() {
		
		int lodgingId = 17;
		
		LodgingVO lodgingInfo = service.getLodgingInfo(lodgingId);
		
		System.out.println("==결과==");
		System.out.println("전체 : " + lodgingInfo);
		System.out.println("lodgingId : " + lodgingInfo.getLodgingId() );
		System.out.println("이미지 정보 : " + lodgingInfo.getImageList().isEmpty());
		
		
	}
}
