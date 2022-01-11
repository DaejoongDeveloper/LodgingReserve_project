package com.reserve.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.reserve.model.Criteria;
import com.reserve.model.LodgingVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class LodgingMapperTest {
	
	@Autowired
	private LodgingMapper mapper;
	
//	@Test
//	public void getLodgingListTest() {
//		
//		Criteria cri = new Criteria();
//		// 테스트 키워드
//		//cri.setKeyword("test");
//		System.out.println("cri : " + cri);
//		
//		List<LodgingVO> list = mapper.getLodgingList(cri);
//		System.out.println("list : " + list);
//		
//		System.out.println("==========");
//		int lodgingTotal = mapper.lodgingGetTotal(cri);
//		System.out.println("totla : " + lodgingTotal);
//		
//	}
	
	// 임대인 id 리스트 요청 
//	
//	@Test
//	public void getLeaseId() {
//		
//		String keyword = "t";
//		
//		String[] list = mapper.getLeaseIdList(keyword);
//		
//		System.out.println("결과 : " + list.toString());
//		
//		for(String id : list) {
//			System.out.println("개별 결과 : " + id);
//		}
//	}
// 검색 (동적 쿼리 적용) - 임대인
	
//	@Test 
//	public void getLodgingListTest1() {
//		//
//		Criteria cri = new Criteria();
//		String type = "A";
//		String keyword = "홍길동";		// DB에 등록된 임대인 데이터
//        //String keyword = "없음";		// DB에 등록되지 않은 임대인 데이터
//		String catecode = "";
//		
//		cri.setType(type);
//		cri.setKeyword(keyword);
//		cri.setLeaseArr(mapper.getLeaseIdList(keyword));
//		cri.setCateCode(catecode);
//		
//		List<LodgingVO> list = mapper.getLodgingList(cri);
//		
//		System.out.println("cri : " + cri);
//		System.out.println("list : " + list);
//		
//	}
//	
//	
//	
//	
//	/* 검색 (동적 쿼리 적용) - 카테고리 + 임대인 */
//	
//	@Test 
//	public void getLodgingListTest4() {
//		Criteria cri = new Criteria();
//		String type = "AC";
//		String keyword = "홍길동";	// 카테고리에 존재하는 임대인
//		//String keyword = "머스크";	// 카테고리에 존재하지 않는 임대인
//		String catecode = "103002";
//		
//		cri.setType(type);
//		cri.setKeyword(keyword);
//		cri.setLeaseArr(mapper.getLeaseIdList(keyword));
//		cri.setCateCode(catecode);
//		
//		List<LodgingVO> list = mapper.getLodgingList(cri);
//		
//		System.out.println("cri : " + cri);
//		System.out.println("list : " + list);	
//		
//	}
	
	
	
	
//	/* 검색 (동적 쿼리 적용) - 카테고리 + 숙소 제목 */
//	
//	@Test 
//	public void getLodgingListTest5() {
//		Criteria cri = new Criteria();
//		String type = "CT";			// 카테고리에 존재하는 숙소
//		String keyword = "테스트";	// 카테고리에 존재하지 않는 숙
//		//String keyword = "없음";
//		String catecode = "111";
//		
//		cri.setType(type);
//		cri.setKeyword(keyword);
//		cri.setLeaseArr(mapper.getLeaseIdList(keyword));
//		cri.setCateCode(catecode);
//		
//		List<LodgingVO> list = mapper.getLodgingList(cri);
//		
//		System.out.println("cri : " + cri);
//		System.out.println("list : " + list);	
//		
//	}
	
//	// 카테고리 리스트
//	@Test
//	public void getCateListTest1() {
//		
//		Criteria cri = new Criteria();
//		
//		String type = "TC";
//		String keyword = "test";
//			
//
//		cri.setType(type);
//		cri.setKeyword(keyword);		
//		
//		String[] cateList = mapper.getCateList(cri)		;
//		for(String codeNum : cateList) {
//			System.out.println("codeNum ::::: " + codeNum);
//		}
//		
//		
//	}
	// 카테고리 정보 얻기
//	@Test
//	public void getCateInfoTest1() {
//		
//		Criteria cri = new Criteria();
//		
//		String type = "TC";
//		String keyword = "test";	
//		String cateCode="111";
//
//		cri.setType(type);
//		cri.setKeyword(keyword);
//		cri.setCateCode(cateCode);
//		
//		mapper.getCateInfo(cri);
//		
//	}
	// 숙소 정보 
//	@Test
//	public void getLodgingInfo() {
//		int lodgingId = 17;
//		LodgingVO lodgingInfo = mapper.getLodgingInfo(lodgingId);
//		System.out.println("===========================");
//		System.out.println(lodgingInfo);
//		System.out.println("===========================");
//		
//	}
}
