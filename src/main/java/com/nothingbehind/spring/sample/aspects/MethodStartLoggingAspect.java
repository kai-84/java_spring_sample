package com.nothingbehind.spring.sample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodStartLoggingAspect {
	@Before("execution(* *..*ServiceImpl.*(..))")
	public void startLog(JoinPoint jp) {
		System.out.println("Method Start: " + jp.getSignature());
	}
}
