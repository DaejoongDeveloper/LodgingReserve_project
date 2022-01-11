package com.reserve.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.reserve.model.AttachImageVO;
import com.reserve.model.Criteria;
import com.reserve.model.LodgingVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AdminMapperTest {
	@Autowired
	private AdminMapper mapper;
	
	/*
	// 숙소 등록
	@Test
	public void lodgingEnrollTest() throws Exception{
		
		LodgingVO lodging = new LodgingVO();
		
		lodging.setLodgingName("mapper 테스트");
		lodging.setLeaseId(123);
		lodging.setCateCode("0231");
		lodging.setLodgingPrice(200000);
		lodging.setLodgingStock(10);
		lodging.setLodgingIntro("숙소 소개 ");
		lodging.setLodgingContents("숙소 목차 ");
		
		System.out.println("Before LodgingVO :" + lodging);
		
		mapper.lodgingEnroll(lodging);
		
		System.out.println("After LodgingVO :" + lodging);
	}
	*/
	
	/*
	//카테고리 리스트
	@Test
	public void cateListTest() throws Exception{
		
		System.out.println("cateList()..........." + mapper.cateList());
		
	}
	*/
	
	/*
	// 숙소 리스트 , 숙소 총 개수
	@Test
	public void lodgingGetListTest() {
		
		Criteria cri = new Criteria();
		
		// 검색조건
		cri.setKeyword("테스트");
		
		// 검색 리스트
		List list = mapper.lodgingGetList(cri);
		for(int i = 0; i < list.size(); i++) {
			System.out.println("result......." + i + " : " + list.get(i));
		}
		
		// 숙소 총 개수
		int result = mapper.lodgingGetTotal(cri);
		System.out.println("resutl.........." + result);
	}
	*/
	/*
	// 숙소 조회 페이지
	@Test
	public void lodgingGetDetailTest() {
		
		int lodgingId = 3;
		
		LodgingVO result = mapper.lodgingGetDetail(lodgingId);
		
		System.out.println("숙소 조회 데이터 : " + result);
	}
	*/
	/*
	// 숙소 정보 수정
	@Test
	public void lodgingModifyTest() {
		
		LodgingVO lodging = new LodgingVO();
		
		lodging.setLodgingId(1);
		lodging.setLodgingName("테스트");
		lodging.setLeaseId(1);
		lodging.setCateCode("111");
		lodging.setLodgingPrice(20000);
		lodging.setLodgingStock(300);
		lodging.setLodgingIntro("숙소 소개 ");
		lodging.setLodgingContents("숙소 목차 ");
		
		mapper.lodgingModify(lodging);
		
	}
	*/
	
	/*
	@Test
	public void lodgingDeleteTest() {
		
		int lodgingId = 7;
		
		int result = mapper.lodgingDelete(lodgingId);
		
		if(result == 1) {
			System.out.println("삭제 성공");
		}
		
	}
	*/
	
	/* 이미지 등록 */
//	@Test
//	public void imageEnrollTest() {
//		
//		AttachImageVO vo = new AttachImageVO();
//		
//		vo.setLodgingId(1);
//		vo.setFileName("test");
//		vo.setUploadPath("test");
//		vo.setUuid("test2");
//		
//		mapper.imageEnroll(vo);
//		
//	}
	
//	// 지정 상품 이미지 삭제 
//	@Test
//	public void deleteImageAllTest() {
//		
//		int lodgingId = 15;
//		
//		mapper.deleteImageAll(lodgingId);
//		
//	}
//	// 어제자 날짜 이미지 리스트 
//	@Test
//	public void checkImageListTest() {
//		
//		mapper.checkFileList();
//		
//	}
	// 지정 상품 이미지 정보 얻기
//	@Test
//	public void getAttachInfoTest() {
//		
//		int lodgingId = 17;
//		
//		List<AttachImageVO> list = mapper.getAttachInfo(lodgingId);
//		
//		System.out.println("list : " + list);
//		
//	}
}
