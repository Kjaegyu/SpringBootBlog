package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아니고
//특정 애너테이션이 붙어있는 클래스 파일드을 new해서(IoC) 스프링 컨네이터에 관리해 준다.
@RestController
public class BlogControllerTest {
	
	//http://localhost:8097/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}