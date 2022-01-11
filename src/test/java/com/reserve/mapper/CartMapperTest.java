package com.reserve.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.reserve.model.CartDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class CartMapperTest {
	
	@Autowired
	private CartMapper mapper;
	
//	@Test
//	public void addCart() {
//		String memberId = "test";
//		int lodgingId = 20;
//		int count = 2;
//		
//		CartDTO cart = new CartDTO();
//		cart.setMemberId(memberId);
//		cart.setLodgingId(lodgingId);
//		cart.setLodgingCount(count);
//		
//		int result = 0;
//		result = mapper.addCart(cart);
//		
//		System.out.println("결과 : " + result);
//		
//	}	
	
//	
//	/* 카트 삭제 */
//
//	@Test
//	public void deleteCartTest() {
//		int cartId = 5;
//		
//		mapper.deleteCart(cartId);
//	}

	
//	/* 카트 수량 수정 */
//
//	@Test
//	public void modifyCartTest() {
//		int cartId = 7;
//		int count = 5;
//		
//		CartDTO cart = new CartDTO();
//		cart.setCartId(cartId);
//		cart.setLodgingCount(count);
//		
//		mapper.modifyCount(cart);
//		
//	}
//
//	
	/* 카트 목록 */ 
//
//	@Test
//	public void getCartTest() {
//		String memberId = "test";
//		
//		
//		List<CartDTO> list = mapper.getCart(memberId);
//		for(CartDTO cart : list) {
//			System.out.println(cart);
//			cart.initTotal();
//			System.out.println("init cart : " + cart);
//		}
//		
//		
//	
//	}
//	*/		
	/* 카트 확인 */

	@Test
	public void checkCartTest() {
		
		String memberId = "test";
		int lodgingId = 20;
		
		CartDTO cart = new CartDTO();
		cart.setMemberId(memberId);
		cart.setLodgingId(lodgingId);
		
		CartDTO resutlCart = mapper.checkCart(cart);
		System.out.println("결과 : " + resutlCart);
		
	}
}
