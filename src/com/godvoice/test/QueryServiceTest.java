package com.godvoice.test;

import java.util.List;

import org.junit.Test;

import com.godvoice.beans.Singer;
import com.godvoice.service.QueryService;
import com.godvoice.service.QueryServiceImp;

public class QueryServiceTest {
	QueryService qs = new QueryServiceImp();
	@Test
	public void test01() {
		List<Singer> singerByWord = qs.getSingerByWord("陈");
		System.out.println(singerByWord);
	}
    @Test
    public void test02() {
    System.out.println(qs.getAlbumByWord("f"));	
    }
    @Test
    public void test03() {
    	System.out.println(qs.getSongByWord("说"));
    }
}
