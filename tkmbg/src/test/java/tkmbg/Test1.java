package tkmbg;

import oracle.mapper.TestBakMapper;
import oracle.model.TestBak;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**  
 * Copyright: Copyright (c) 2016 wisedu
 * 
 * @ClassName: Test.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: hyluan
 * @date: 2016年11月28日 下午1:15:14 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2016年11月28日     hyluan           v1.0.0               修改原因
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "classpath*:config/applicationContext*.xml" })  
public class Test1 {
	
	@Autowired
	private TestBakMapper testBakMapper;
	@Test
	public void testOracleSeq(){
		TestBak testBak = new TestBak();
		testBakMapper.insert(testBak);
		System.out.println(	testBak.getbDesc());
		System.out.println(	testBak.getbName());
	}
}
